package com.gzh.candy_bms.record.bean.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gzh.candy_bms.common.base.BaseModel;
import lombok.*;

import java.io.Serializable;

/**
 * 收支记录表 DO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("balance_sheet_record")
public class BalanceSheetRecordDO extends BaseModel implements Serializable {

    private static final long serialVersionUID = -530616261814639472L;

    /**
     * 记录日期
     */
    @TableField("record_date")
    private String recordDate;

    /**
     * 收支标志；0-收入；1-支出
     */
    @TableField("balance_type")
    private String balanceType;

    /**
     * 收支细分标志；0-固定收入；1-额外收入；2-固定支出；3-额外支出
     */
    @TableField("subsidiary_balance_type")
    private String subsidiaryBalanceType;

    /**
     * 收支细分类别ID
     */
    @TableField("subsidiary_type_id")
    private String subsidiaryTypeId;

    /**
     * 收支总类别ID
     */
    @TableField("general_type_id")
    private String generalTypeId;

    /**
     * 收支描述
     */
    @TableField("balance_describe")
    private String balanceDescribe;

    /**
     * 支出评价；0-好支出；1-坏支出；2-必须支出
     */
    @TableField("expenses_evaluation")
    private String expensesEvaluation;

    /**
     * 坏支出原因
     */
    @TableField("bad_expenses_reason")
    private String badExpensesReason;
}
