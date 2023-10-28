package com.gzh.candy_bms.common.base;

import lombok.Data;

/**
 * 分页入参
 *
 * @author gaozhiheng
 */
@Data
public class PageRequest {

    /**
     * 当前页数
     */
    private int pageNum = 1;

    /**
     * 每页数量
     */
    private int pageSize = 10;
}
