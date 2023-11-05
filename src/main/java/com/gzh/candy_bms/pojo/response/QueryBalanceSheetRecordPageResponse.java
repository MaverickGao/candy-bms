package com.gzh.candy_bms.pojo.response;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 收支记录分页列表 接口响应
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class QueryBalanceSheetRecordPageResponse {

    /**
     * 收支记录表ID
     */
    private String id;

    /**
     * 记录时间
     */
    private String recordDate;

    /**
     * 收支标志；0-收入；1-支出
     */
    private String balanceType;

    /**
     * 收支标志 中文
     */
    private String balanceTypeCN;

    /**
     * 收支细分标志；0-固定收入；1-额外收入；2-固定支出；3-额外支出
     */
    private String subsidiaryBalanceType;

    /**
     * 收支细分标志 中文
     */
    private String subsidiaryBalanceTypeCN;

    /**
     * 收支总类别ID
     */
    private String generalTypeId;

    /**
     * 收支总类别名称
     */
    private String generalTypeName;

    /**
     * 收支细分类别ID
     */
    private String subsidiaryTypeId;

    /**
     * 收支细分类别名称
     */
    private String subsidiaryTypeName;

    /**
     * 收支金额
     */
    private BigDecimal balanceAmount;

    /**
     * 收支金额 格式转换
     */
    private String balanceAmountFmt;

    /**
     * 收支描述
     */
    private String balanceDescribe;

    /**
     * 支出评价；0-好支出；1-坏支出；2-必须支出
     */
    private String expensesEvaluation;

    /**
     * 支出评价 中文
     */
    private String expensesEvaluationCN;

    /**
     * 坏支出原因
     */
    private String badExpensesReason;
}
