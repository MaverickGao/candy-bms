package com.gzh.candy_bms.common.base;

import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 分页查询接口
 *
 * @param <T> 实体类
 */
@FunctionalInterface
public interface Query<T> {
    IPage<T> doQuery();
}
