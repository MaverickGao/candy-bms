package com.gzh.candy_bms.tencentcloud;

import com.qcloud.vod.VodUploadClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * 腾讯云 云点播 服务
 *
 * @author gaozhiheng
 */
@Repository
public class TencentCloudVideoServer extends TencentCloudVideoBaseServer implements BaseServer {

    /**
     * 构建云点播配置类
     *
     * @return 配置类
     */
    @Override
    protected TencentVideoConfig getTencentVideoConfig() {
        String baseUrl = null;
        try {
            baseUrl = ResourceUtils.getURL("classpath:").getPath();
        } catch (FileNotFoundException e) {
            log.info("未获取到路径");
            throw new RuntimeException(e);
        }
        // 检查初始路径
        try {
            checkStoragePath(baseUrl);
        } catch (Exception e) {
            log.info("腾讯云云点播临时文件存储路径创建失败！");
        }
        return getVideoConfig(baseUrl);
    }

    private TencentVideoConfig getVideoConfig(String baseUrl) {
        TencentVideoConfig result = new TencentVideoConfig();
        result.setTencentCloudVideoSecretId(properties.getTencentCloudVideoSecretId());
        result.setTencentCloudVideoSecretKey(properties.getTencentCloudVideoSecretKey());
        result.setTencentCloudVideoSubAppId(properties.getTencentCloudVideoSubAppId());
        result.setTencentCloudVideoStorageRegion(properties.getTencentCloudVideoStorageRegion());
        result.setTencentCloudVideoStoragePath(baseUrl + properties.getTencentCloudVideoStoragePath());
        result.setTencentCloudCoverStoragePath(baseUrl + properties.getTencentCloudCoverStoragePath());
        return result;
    }

    /**
     * 连接 云点播 Client
     *
     * @return 云点播Client
     */
    @Override
    protected VodUploadClient buildVodUploadClient() {
        return new VodUploadClient(properties.getTencentCloudVideoSecretId(), properties.getTencentCloudVideoSecretKey());
    }

    /**
     * 存储 路径检查
     */
    private void checkStoragePath(String baseUrl) throws Exception {
        // 检查视频文件存储路径是否存在
        File videoStoragePath = new File(baseUrl + properties.getTencentCloudVideoStoragePath());
        if (!videoStoragePath.exists()) {
            boolean createResult = videoStoragePath.mkdirs();
            log.info("视频文件存储路径初始化结果：{}", createResult);
        }
        // 检查封面文件存储路径是否存在
        File coverStoragePath = new File(baseUrl + properties.getTencentCloudCoverStoragePath());
        if (!coverStoragePath.exists()) {
            boolean createResult = coverStoragePath.mkdirs();
            log.info("封面文件存储路径初始化结果：{}", createResult);
        }
    }
}
