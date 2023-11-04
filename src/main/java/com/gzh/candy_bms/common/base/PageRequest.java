package com.gzh.candy_bms.common.base;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页入参
 *
 * @author gaozhiheng
 */
@Data
public abstract class PageRequest implements Serializable {

    private static final long serialVersionUID = -5809555492672513874L;

    /**
     * 当前页数
     */
    private int pageNum = 1;

    /**
     * 每页数量
     */
    private int pageSize = 10;

    /**
     * 是否返回查询总数
     */
    private boolean isSearchCount = true;
}
