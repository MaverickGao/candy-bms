package com.gzh.candy_bms.record.bean.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gzh.candy_bms.common.base.BaseModel;
import lombok.*;

import java.io.Serializable;

/**
 * 收支总类别 DO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("balance_sheet_general_type")
public class BalanceSheetGeneralTypeDO extends BaseModel implements Serializable {

    private static final long serialVersionUID = 9212476959696265395L;

    /**
     * 总类别名称
     */
    @TableField("type_name")
    private String typeName;

    /**
     * 收支标志；0-收入；1-支出
     */
    @TableField("balance_type")
    private String balanceType;

    /**
     * 总类别描述
     */
    @TableField("general_type_describe")
    private String generalTypeDescribe;
}
