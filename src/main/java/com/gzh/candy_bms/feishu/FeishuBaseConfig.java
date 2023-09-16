package com.gzh.candy_bms.feishu;

import lombok.Data;

/**
 * 飞书SDK 配置参数
 *
 * @author gaozhiheng
 */
@Data
public class FeishuBaseConfig {

    /**
     * 飞书 AppID
     */
    private String feishuAppId;

    /**
     * 飞书密钥
     */
    private String feishuAppSecret;
}
