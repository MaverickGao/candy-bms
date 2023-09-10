package com.gzh.candy_bms.feishu;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 飞书SDK 配置参数
 *
 * @author gaozhiheng
 */
@Data
@Component
public class FeishuProperties {

    /**
     * 飞书 AppID
     */
    @Value("${feishu.app-id}")
    private String feishuAppId;

    /**
     * 飞书密钥
     */
    @Value("${feishu.app-secret}")
    private String feishuAppSecret;
}
