package com.gzh.candy_bms.common.base.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误信息返回码
 *
 * @author gaozhiheng
 */
@Getter
@AllArgsConstructor
public enum ReturnCode implements ReturnCodeAndMsg {

    /**
     * 公共报错信息
     */
    PARAMETERS_ERROR("10000001", "参数错误"),

    /**
     * 登录报错信息
     */
    LOGIN_NO_ACCOUNT_ERROR("20010001", "登录失败：请输入登录账户名"),

    /**
     * 登录报错信息
     */
    LOGIN_NO_DATA_ERROR("20010002", "登录失败：未查询到用户信息"),

    /**
     * 腾讯云点播文件上传失败，文件存储到本地失败
     */
    TENCENT_VIDEO_STORAGE_TO_LOCAL_ERROR("30010001", "腾讯云点播文件上传失败，文件存储到本地失败"),

    /**
     * 腾讯云点播文件上传失败，文件存储到本地失败，未传入文件名
     */
    TENCENT_VIDEO_STORAGE_NO_FILENAME_ERROR("30010002", "腾讯云点播文件上传失败，文件存储到本地失败，未传入文件名"),

    /**
     * 腾讯云点播文件上传失败
     */
    TENCENT_VIDEO_ERROR("30010003", "腾讯云点播文件上传失败"),

    /**
     * 新增收支总类别数据失败
     */
    INSERT_GENERAL_TYPE_ERROR("40010001", "新增收支总类别数据失败")
    ;

    private final String code;
    private final String message;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
