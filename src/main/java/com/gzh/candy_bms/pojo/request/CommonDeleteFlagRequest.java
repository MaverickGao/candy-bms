package com.gzh.candy_bms.pojo.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
/**
 * 通用删除 Request
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class CommonDeleteFlagRequest implements Serializable {

    private static final long serialVersionUID = 8826435330323676251L;

    /**
     * 数据ID
     */
    @NotBlank(message = "数据ID不能为空")
    private String id;
}
