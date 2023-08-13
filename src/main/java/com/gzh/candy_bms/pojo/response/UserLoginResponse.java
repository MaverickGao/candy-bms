package com.gzh.candy_bms.pojo.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 登录接口响应
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class UserLoginResponse implements Serializable {

    private static final long serialVersionUID = -6974302974356010897L;
    /**
     * 登录token
     */
    private String token;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户code
     */
    private String userCode;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 部门编码
     */
    private String deptCode;

    /**
     * 部门名称
     */
    private String deptName;
}
