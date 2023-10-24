package com.gzh.candy_bms.pojo.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 查询收支细分类别列表 接口请求
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class QuerySubsidiaryTypeRequest implements Serializable {

    private static final long serialVersionUID = 2196096765685945654L;

    /**
     * 总类别ID
     */
    @NotBlank(message = "总类别ID不能为空")
    private String generalTypeId;

    /**
     * 细分类别名称
     */
    private String subsidiaryTypeName;

    /**
     * 收支标志；0-收入；1-支出
     */
    @NotBlank(message = "收支标志不能为空")
    private String balanceType;
}
