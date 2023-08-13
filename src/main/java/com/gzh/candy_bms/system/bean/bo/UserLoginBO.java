package com.gzh.candy_bms.system.bean.bo;

import lombok.Data;
import lombok.ToString;

/**
 * 登录接口响应
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class UserLoginBO {

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
