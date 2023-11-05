package com.gzh.candy_bms.pojo.request;

import com.gzh.candy_bms.common.base.PageRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 身体指标管理 分页列表 Request
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class QueryBodyIndexRecordPageRequest extends PageRequest implements Serializable {
    private static final long serialVersionUID = -844995255452552888L;
}
