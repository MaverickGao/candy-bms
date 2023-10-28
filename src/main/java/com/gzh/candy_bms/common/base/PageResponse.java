package com.gzh.candy_bms.common.base;

import lombok.Data;

import java.util.List;

/**
 * 分页响应
 *
 * @param <T> 泛型对象
 */
@Data
public class PageResponse<T> {

    /**
     * 数据总数
     */
    private int total;

    /**
     * 当前页数据
     */
    private List<T> data;
}
