package com.gzh.candy_bms.record.bean.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gzh.candy_bms.common.base.BaseModel;
import lombok.*;

import java.io.Serializable;

/**
 * 收支细分类别 DO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("balance_sheet_subsidiary_type")
public class BalanceSheetSubsidiaryTypeDO extends BaseModel implements Serializable {

    private static final long serialVersionUID = 3592718524556692043L;

    /**
     * 总类别名称
     */
    @TableField("general_type_id")
    private String generalTypeId;

    /**
     * 明细类别名称
     */
    @TableField("type_name")
    private String typeName;

    /**
     * 收支标志；0-收入；1-支出
     */
    @TableField("balance_type")
    private String balanceType;

    /**
     * 明细类别描述
     */
    @TableField("subsidiary_type_describe")
    private String subsidiaryTypeDescribe;
}
