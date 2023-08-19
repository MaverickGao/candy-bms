package com.gzh.candy_bms.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 数据状态枚举类
 *
 * @author gaozhiheng
 */
@Getter
@AllArgsConstructor
public enum DeleteFlagEnum {
    DELETED("1", "已删除"),
    UN_DELETED("0", "未删除")
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
