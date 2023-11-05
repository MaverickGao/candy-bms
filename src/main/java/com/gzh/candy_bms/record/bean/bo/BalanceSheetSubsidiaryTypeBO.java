package com.gzh.candy_bms.record.bean.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * 收支明细类别 BO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class BalanceSheetSubsidiaryTypeBO {

    /**
     * 总类别ID
     */
    @NotNull(message = "请输入总类别ID")
    private String generalTypeId;

    /**
     * 总类别名称
     */
    @NotNull(message = "请输入明细类别名称")
    private String typeName;

    /**
     * 收支标志；0-收入；1-支出
     */
    @NotNull(message = "请选择收支标志")
    private String balanceType;

    /**
     * 明细类别描述
     */
    private String subsidiaryTypeDescribe;
}
