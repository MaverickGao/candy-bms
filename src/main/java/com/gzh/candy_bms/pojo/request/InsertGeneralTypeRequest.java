package com.gzh.candy_bms.pojo.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 收支总类别 Request
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class InsertGeneralTypeRequest implements Serializable {

    private static final long serialVersionUID = 7908647430658627035L;

    /**
     * 总类别名称
     */
    @NotNull(message = "请输入总类别名称")
    private String typeName;

    /**
     * 收支标志；0-收入；1-支出
     */
    @NotNull(message = "请选择收支标志")
    private String balanceType;

    /**
     * 总类别描述
     */
    private String generalTypeDescribe;
}
