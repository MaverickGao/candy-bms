package com.gzh.candy_bms.common.base.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 自定义Exception
 *
 * @author gaozhiheng
 */
@Getter
@Setter
@ToString
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -3996854637935094856L;

    /**
     * 报错编码
     */
    private String errorCode;

    /**
     * 报错信息
     */
    private String errorMessage;

    public BusinessException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BusinessException(ReturnCodeAndMsg codeEnum) {
        super(codeEnum.getMessage());
        this.errorCode = codeEnum.getCode();
        this.errorMessage = codeEnum.getMessage();
    }
}
