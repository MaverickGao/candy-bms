package com.gzh.candy_bms.pojo.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * 登录接口 Request
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class UserLoginRequest {

    @NotNull(message = "请输入账号")
    private String account;
}
