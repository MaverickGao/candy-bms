package com.gzh.candy_bms.pojo.request;

import com.gzh.candy_bms.common.base.PageRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 收支记录 分页列表 Request
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class QueryBalanceSheetRecordPageRequest extends PageRequest implements Serializable {

    private static final long serialVersionUID = 3926892710948893719L;

    /**
     * 记录时间
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
     * 收支总类别ID
     */
    private String generalTypeId;

    /**
     * 收支细分类别ID
     */
    private String subsidiaryTypeId;

    /**
     * 支出评价；0-好支出；1-坏支出；2-必须支出
     */
    private String expensesEvaluation;
}
