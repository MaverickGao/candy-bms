package com.gzh.candy_bms.system.bean.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gzh.candy_bms.common.base.BaseModel;
import lombok.*;

import java.io.Serializable;

/**
 * 系统用户实体类DO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("bus_user")
public class BusUserDO extends BaseModel implements Serializable {

    private static final long serialVersionUID = 6020704572187899980L;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户电话
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 用户Email
     */
    @TableField("email")
    private String email;

    /**
     * 角色ID
     */
    @TableField("role_id")
    private String roleId;

    /**
     * 部门ID
     */
    @TableField("department_id")
    private String departmentId;

    /**
     * 用户Code
     */
    @TableField("user_code")
    private String userCode;

    /**
     * 用户状态；0-生效；1-冻结；2-注销
     */
    @TableField("status")
    private String status;
}
