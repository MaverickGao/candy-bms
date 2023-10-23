package com.gzh.candy_bms.pojo.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 查询收支总类别列表 接口响应
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class QueryGeneralTypeResponse implements Serializable {

    private static final long serialVersionUID = -921014083830497678L;

    /**
     * 总类别ID
     */
    private String generalTypeId;

    /**
     * 总类别名称
     */
    private String generalTypeName;
}
