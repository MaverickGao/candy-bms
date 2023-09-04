package com.gzh.candy_bms.tencentcloud;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.gzh.candy_bms.common.base.exception.BusinessException;
import com.gzh.candy_bms.common.base.exception.ReturnCode;
import com.gzh.candy_bms.tencentcloud.bean.bo.StorageBO;
import com.gzh.candy_bms.tencentcloud.bean.model.TencentVideoStorageHistoryDO;
import com.gzh.candy_bms.tencentcloud.enums.TencentUploadStatus;
import com.gzh.candy_bms.tencentcloud.logic.TencentVideoStorageHistoryLogic;
import com.qcloud.vod.model.VodUploadResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Objects;

/**
 * 腾讯云 云点播 Helper
 *
 * @author gaozhiheng
 */
@Slf4j
@Component
public class TencentCloudVideoHelper {

    @Resource
    private TencentCloudVideoServer server;

    @Resource
    private TencentVideoStorageHistoryLogic tencentVideoStorageHistoryLogic;

    /**
     * 上传文件到腾讯云服务器
     *
     * @param file 待上传文件
     */
    @Async
    public void upload(MultipartFile file) {
        // 先将文件保存到本地
        StorageBO localFileBO;
        try {
            localFileBO = server.storageFileToLocal(file, server.getTencentCloudVideoStoragePath());
        } catch (IOException e) {
            log.error("文件存储失败", e);
            throw new BusinessException(ReturnCode.TENCENT_VIDEO_STORAGE_TO_LOCAL_ERROR);
        }
        // 新增记录数据
        String id = IdWorker.getIdStr();
        tencentVideoStorageHistoryLogic.saveInfo(buildSaveInfo(localFileBO, id));
        try {
            VodUploadResponse response = server.uploadFile(localFileBO);
            updateSuccessStatus(id, response.getFileId(), response.getMediaUrl());
        } catch (Exception e) {
            log.error(ReturnCode.TENCENT_VIDEO_ERROR.getMessage(), e);
            updateFailStatus(id);
        }
    }

    /**
     * 准备新增数据
     *
     * @param localFileBO 本地文件BO
     * @param id          数据ID
     * @return 新增数据
     */
    private TencentVideoStorageHistoryDO buildSaveInfo(StorageBO localFileBO, String id) {
        if (Objects.isNull(localFileBO)) {
            return null;
        }
        TencentVideoStorageHistoryDO result = new TencentVideoStorageHistoryDO();
        result.setId(id);
        result.setFileName(localFileBO.getFileName());
        result.setUploadStatus(TencentUploadStatus.UPLOAD.getCode());
        return result;
    }

    /**
     * 更新失败状态
     *
     * @param id 数据ID
     */
    private void updateFailStatus(String id) {
        if (StringUtils.isBlank(id)) {
            return;
        }
        TencentVideoStorageHistoryDO tencentVideoStorageHistoryDO = tencentVideoStorageHistoryLogic.queryById(id);
        if (Objects.isNull(tencentVideoStorageHistoryDO)) {
            return;
        }
        tencentVideoStorageHistoryDO.setUploadStatus(TencentUploadStatus.UPLOAD_FAIL.getCode());
        tencentVideoStorageHistoryLogic.updateInfo(tencentVideoStorageHistoryDO);
    }

    /**
     * 更新成功状态
     *
     * @param id       数据ID
     * @param fileId   文件ID
     * @param mediaUrl 文件地址
     */
    private void updateSuccessStatus(String id, String fileId, String mediaUrl) {
        if (StringUtils.isBlank(id)) {
            return;
        }
        TencentVideoStorageHistoryDO tencentVideoStorageHistoryDO = tencentVideoStorageHistoryLogic.queryById(id);
        if (Objects.isNull(tencentVideoStorageHistoryDO)) {
            return;
        }
        tencentVideoStorageHistoryDO.setUploadStatus(TencentUploadStatus.UPLOAD_SUCCESS.getCode());
        tencentVideoStorageHistoryDO.setTencentFileId(fileId);
        tencentVideoStorageHistoryDO.setMediaUrl(mediaUrl);
        tencentVideoStorageHistoryLogic.updateInfo(tencentVideoStorageHistoryDO);
    }
}
