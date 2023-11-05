package com.gzh.candy_bms.pojo.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 查询收支细分类别列表 接口响应
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class QuerySubsidiaryTypeResponse implements Serializable {

    private static final long serialVersionUID = 6624921124600735470L;
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
