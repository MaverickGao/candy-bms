package com.gzh.candy_bms.record.bean.bo;

import lombok.Data;
import lombok.ToString;

/**
 * 查询收支细分类别列表 BO
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class QuerySubsidiaryTypeBO {
    /**
     * 总类别ID
     */
    private String generalTypeId;

    /**
     * 细分类别ID
     */
    private String subsidiaryTypeId;

    /**
     * 细分类别名称
     */
    private String subsidiaryTypeName;
}
