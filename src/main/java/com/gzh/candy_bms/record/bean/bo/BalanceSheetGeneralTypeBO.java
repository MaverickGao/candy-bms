package com.gzh.candy_bms.record.bean.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 收支总类别 BO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class BalanceSheetGeneralTypeBO {

    /**
     * 总类别名称
     */
    private String typeName;

    /**
     * 收支标志；0-收入；1-支出
     */
    private String balanceType;

    /**
     * 总类别描述
     */
    private String generalTypeDescribe;
}
