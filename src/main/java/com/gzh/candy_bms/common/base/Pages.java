package com.gzh.candy_bms.common.base;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * 分页封装
 *
 * @author gaozhiheng
 */
public class Pages {
    private Pages() {
    }

    public static <T> PageResponse<T> query(Query<T> query) {
        IPage<T> page = query.doQuery();
        List<T> list = page.getRecords();
        PageResponse<T> pageResponse = new PageResponse(page);
        pageResponse.setData(list);
        return pageResponse;
    }
}
