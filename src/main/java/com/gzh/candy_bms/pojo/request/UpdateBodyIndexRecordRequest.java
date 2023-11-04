package com.gzh.candy_bms.pojo.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 身体指标管理更新 Request
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class UpdateBodyIndexRecordRequest implements Serializable {

    private static final long serialVersionUID = -295758959213023310L;
}
