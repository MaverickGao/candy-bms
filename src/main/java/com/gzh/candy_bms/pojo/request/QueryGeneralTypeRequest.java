package com.gzh.candy_bms.pojo.request;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * 查询收支总类别列表 接口请求
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class QueryGeneralTypeRequest implements Serializable {

    private static final long serialVersionUID = -1436016869447431016L;

    /**
     * 总类别名称
     */
    private String generalTypeName;

    /**
     * 收支标志；0-收入；1-支出
     */
    @NotBlank(message = "收支标志不能为空")
    private String balanceType;
}
