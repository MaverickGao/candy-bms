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
