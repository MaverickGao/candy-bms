package com.gzh.candy_bms.tencentcloud;

import lombok.Data;

/**
 * 腾讯云 云点播 配置对象
 *
 * @author gaozhiheng
 */
@Data
public class TencentVideoConfig {
    /**
     * 云点播 密钥ID
     */
    private String tencentCloudVideoSecretId;

    /**
     * 云点播 密钥
     */
    private String tencentCloudVideoSecretKey;

    /**
     * 云点播 应用ID
     */
    private String tencentCloudVideoSubAppId;

    /**
     * 云点播 视频存储地域
     */
    private String tencentCloudVideoStorageRegion;

    /**
     * 云点播 本地视频存储路径
     */
    private String tencentCloudVideoStoragePath;

    /**
     * 云点播 本地视频封面文件存储路径
     */
    private String tencentCloudCoverStoragePath;
}
