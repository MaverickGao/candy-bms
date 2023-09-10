package com.gzh.candy_bms.feishu;

/**
 * 飞书工具工厂 接口
 *
 * @author gaozhiheng
 */
public interface FeishuFactory {

    /**
     * 默认获取飞书 AccessToken
     *
     * @return AccessToken
     */
    String createAccessToken();
}
