package com.gzh.candy_bms.common.base;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 分页响应
 *
 * @param <T> 泛型对象
 */
@Data
@ToString
public class PageResponse<T> implements Serializable {

    private static final long serialVersionUID = -1600115248950986378L;

    /**
     * 数据总数
     */
    private Long total;

    /**
     * 当前页数据量
     */
    private Long pageSize;

    /**
     * 当前页数
     */
    private Long pageNum;

    /**
     * 总页数
     */
    private Long pages;

    /**
     * 当前页数据
     */
    private List<T> data;

    public PageResponse() {
    }

    /**
     * 实例化分页对象
     *
     * @param page 分页数据
     */
    public PageResponse(IPage<?> page) {
        this.total = page.getTotal();
        this.pageSize = page.getSize();
        this.pageNum = page.getCurrent();
        this.pages = page.getPages();
    }
}
