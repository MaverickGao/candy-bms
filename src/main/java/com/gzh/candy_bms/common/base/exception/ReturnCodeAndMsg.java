package com.gzh.candy_bms.common.base.exception;

/**
 * 接口返回编码与信息
 *
 * @author gaozhiheng
 */
public interface ReturnCodeAndMsg {

    /**
     * 获取接口返回信息
     *
     * @return 接口返回信息
     */
    String getMessage();

    /**
     * 获取接口返回编码
     *
     * @return 接口返回编码0
     */
    String getCode();
}
