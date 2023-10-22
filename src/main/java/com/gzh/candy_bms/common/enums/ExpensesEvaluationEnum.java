package com.gzh.candy_bms.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 支出评价；
 * 0-好支出；1-坏支出；2-必须支出
 *
 * @author gaozhiheng
 */
@Getter
@AllArgsConstructor
public enum ExpensesEvaluationEnum {
    GOOD_EXPENSES("0","好支出"),
    BAD_EXPENSES("1","坏支出"),
    MUST_EXPENSES("2","必须支出");

    /**
     * 枚举值
     */
    private final String code;

    /**
     * 枚举内容
     */
    private final String desc;
}
