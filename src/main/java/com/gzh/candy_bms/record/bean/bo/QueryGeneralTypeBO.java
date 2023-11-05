package com.gzh.candy_bms.record.bean.bo;

import lombok.Data;
import lombok.ToString;

/**
 * 查询收支总类别列表 接口响应
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class QueryGeneralTypeBO {

    /**
     * 总类别ID
     */
    private String generalTypeId;

    /**
     * 总类别名称
     */
    private String generalTypeName;
}
