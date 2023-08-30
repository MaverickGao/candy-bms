package com.gzh.candy_bms.common.tencentcloud;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 腾讯云 云点播 配置
 *
 * @author gaozhiheng
 */
@Data
@Component
public class TencentCloudVideoProperties {

    /**
     * 云点播 密钥ID
     */
    @Value("${tencent-cloud.video.secret-id}")
    private String tencentCloudVideoSecretId;

    /**
     * 云点播 密钥
     */
    @Value("${tencent-cloud.video.secret-key}")
    private String tencentCloudVideoSecretKey;

    /**
     * 云点播 应用ID
     */
    @Value("${tencent-cloud.video.sub-app-id}")
    private String tencentCloudVideoSubAppId;

    /**
     * 云点播 视频存储地域
     */
    @Value("${tencent-cloud.video.storage-region}")
    private String tencentCloudVideoStorageRegion;
}
