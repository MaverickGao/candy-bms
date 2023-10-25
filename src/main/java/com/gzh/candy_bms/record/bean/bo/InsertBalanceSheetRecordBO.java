package com.gzh.candy_bms.record.bean.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 收支总类别 BO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class InsertBalanceSheetRecordBO {

    /**
     * 记录日期
     */
    private String recordDate;

    /**
     * 收支标志；0-收入；1-支出
     */
    private String balanceType;

    /**
     * 收支细分标志；0-固定收入；1-额外收入；2-固定支出；3-额外支出
     */
    private String subsidiaryBalanceType;

    /**
     * 收支细分类别ID
     */
    private String subsidiaryTypeId;

    /**
     * 收支总类别ID
     */
    private String generalTypeId;

    /**
     * 收支金额
     */
    private BigDecimal balanceAmount;

    /**
     * 收支描述
     */
    private String balanceDescribe;

    /**
     * 支出评价；0-好支出；1-坏支出；2-必须支出
     */
    private String expensesEvaluation;

    /**
     * 坏支出原因
     */
    private String badExpensesReason;
}
