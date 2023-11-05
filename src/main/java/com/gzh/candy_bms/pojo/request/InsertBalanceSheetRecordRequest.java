package com.gzh.candy_bms.pojo.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 收支总类别 Request
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class InsertBalanceSheetRecordRequest implements Serializable {

    private static final long serialVersionUID = 8273924675658909451L;

    /**
     * 记录日期
     */
    @NotBlank(message = "请选择记录日期")
    private String recordDate;

    /**
     * 收支标志；0-收入；1-支出
     */
    @NotBlank(message = "请选择收支标志")
    private String balanceType;

    /**
     * 收支细分标志；0-固定收入；1-额外收入；2-固定支出；3-额外支出
     */
    @NotBlank(message = "请选择收支细分标志")
    private String subsidiaryBalanceType;

    /**
     * 收支细分类别ID
     */
    @NotBlank(message = "请选择收支细分类别")
    private String subsidiaryTypeId;

    /**
     * 收支总类别ID
     */
    @NotBlank(message = "请选择收支总类别")
    private String generalTypeId;

    /**
     * 收支金额
     */
    @NotNull(message = "请输入收支金额")
    private BigDecimal balanceAmount;

    /**
     * 收支描述
     */
    @NotBlank(message = "请输入收支描述")
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
