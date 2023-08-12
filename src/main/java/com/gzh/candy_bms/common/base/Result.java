package com.gzh.candy_bms.common.base;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 接口返回封装
 *
 * @param <T>
 */
public class Result<T> {

    /**
     * 接口请求成功编码
     */
    public static final String SUCCESS_CODE = "00000000";

    /**
     * 接口请求编码
     */
    private String code;

    /**
     * 接口请求结果信息
     */
    private String msg;

    /**
     * 接口请求结果
     */
    private Boolean isSuccess;

    /**
     * 接口返回数据
     */
    private T data;

    public Result() {

    }

    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode("00000000");
        result.setMsg("success");
        result.setIsSuccess(Boolean.TRUE);
        result.setData((T) null);
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode("00000000");
        result.setMsg("success");
        result.setIsSuccess(Boolean.TRUE);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> failOfCode(String code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setIsSuccess(Boolean.FALSE);
        return result;
    }

    public T open(Consumer<Result<T>> failedConsumer) {
        if ("00000000".equals(this.code)) {
            return this.getData();
        } else {
            if (failedConsumer != null) {
                failedConsumer.accept(this);
            }
            return null;
        }
    }

    public Result<T> then(Consumer<T> consumer) {
        if ("00000000".equals(this.code)) {
            consumer.accept(this.data);
        }
        return this;
    }

    public <R> Result<R> map(Function<T, R> mapper) {
        Result<R> result = new Result<>();
        result.setCode(this.code);
        result.setMsg(this.msg);
        result.setIsSuccess(this.isSuccess);
        if (this.data != null) {
            result.setData(mapper.apply(this.data));
        }
        return result;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
