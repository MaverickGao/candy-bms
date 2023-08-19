package com.gzh.candy_bms.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 用户状态枚举类
 * 0-生效；1-冻结；2-注销
 *
 * @author gaozhiheng
 */
@Getter
@AllArgsConstructor
public enum UserStatusEnum {
    /**
     * 0-生效
     */
    USER_NORMAL("0", "生效"),

    /**
     * 1-冻结
     */
    USER_FREEZE("1", "冻结"),

    /**
     * 2-注销
     */
    USER_LOGOUT("2", "注销"),
    ;

    /**
     * 枚举值
     */
    private final String code;

    /**
     * 枚举内容
     */
    private final String desc;
}
