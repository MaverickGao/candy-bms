package com.gzh.candy_bms.tencentcloud;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.gzh.candy_bms.common.base.exception.BusinessException;
import com.gzh.candy_bms.common.base.exception.ReturnCode;
import com.gzh.candy_bms.tencentcloud.bean.bo.StorageBO;
import com.qcloud.vod.VodUploadClient;
import com.qcloud.vod.model.VodUploadRequest;
import com.qcloud.vod.model.VodUploadResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * 腾讯云 云点播 基础服务
 *
 * @author gaozhiheng
 */
public abstract class TencentCloudVideoBaseServer extends TencentCloudBaseServer {

    /**
     * 云点播配置类
     */
    protected TencentVideoConfig config;

    /**
     * 构建云点播配置类
     *
     * @return 配置类
     */
    protected abstract TencentVideoConfig getTencentVideoConfig();

    /**
     * 启动配置
     */
    @PostConstruct
    protected void initVideoConfig() {
        config = getTencentVideoConfig();
    }

    /**
     * 连接 云点播 Client
     *
     * @return 云点播Client
     */
    protected abstract VodUploadClient buildVodUploadClient();

    /**
     * 上传 视频文件到云点播
     *
     * @param videoFile 视频文件
     * @return 上传结果信息
     */
    public VodUploadResponse uploadFile(StorageBO localFileBO) {
        // 先准备Client
        VodUploadClient client = buildVodUploadClient();
        if (Objects.isNull(localFileBO)) {
            throw new BusinessException(ReturnCode.TENCENT_VIDEO_STORAGE_NO_FILENAME_ERROR);
        }
        // 上传文件到腾讯云
        VodUploadRequest request = new VodUploadRequest();
        request.setMediaFilePath(localFileBO.getFilePath());
        try {
            VodUploadResponse result = client.upload(config.getTencentCloudVideoStorageRegion(), request);
            // 存储文件上传信息
            log.info(result.toString());
            return result;
        } catch (Exception e) {
            log.error(ReturnCode.TENCENT_VIDEO_ERROR.getMessage(), e);
            throw new BusinessException(ReturnCode.TENCENT_VIDEO_ERROR);
        } finally {
            // 删除本地文件
            deleteLocalFile(localFileBO.getFilePath());
        }
    }

    /**
     * 将文件存储到本地
     *
     * @param file     待处理文件
     * @param filePath 文件存储路径
     * @return 存储信息
     */
    public StorageBO storageFileToLocal(MultipartFile file, String filePath) throws IOException {
        StorageBO result = new StorageBO();
        // 文件原始名称
        String fileName = file.getOriginalFilename();
        if (StringUtils.isBlank(fileName)) {
            return null;
        }
        result.setFileName(fileName);
        // 将文件转换为ID
        int dot = fileName.lastIndexOf('.');
        String extension = fileName.substring(dot + 1);
        String idName = IdWorker.getIdStr() + "." + extension;

        String storageFilePath = filePath + idName;
        result.setFilePath(storageFilePath);
        // 将文件存储到本地
        File localFile = new File(storageFilePath);
        file.transferTo(localFile);
        return result;
    }

    /**
     * 返回视频本地存储地址
     *
     * @return 视频本地存储地址
     */
    public String getTencentCloudVideoStoragePath() {
        return config.getTencentCloudVideoStoragePath();
    }

    /**
     * 删除本地临时文件
     *
     * @param filePath 待删除文件
     */
    private void deleteLocalFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            boolean delete = file.delete();
        }
    }
}
