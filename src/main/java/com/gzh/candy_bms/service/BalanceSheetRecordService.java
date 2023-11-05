package com.gzh.candy_bms.service;

import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.pojo.request.InsertBalanceSheetRecordRequest;
import com.gzh.candy_bms.pojo.request.QueryBalanceSheetRecordPageRequest;
import com.gzh.candy_bms.pojo.response.QueryBalanceSheetRecordPageResponse;

/**
 * 收支记录表 Service
 *
 * @author gaozhiheng
 */
public interface BalanceSheetRecordService {

    /**
     * 插入一条 收支记录 数据
     *
     * @param request 待新增数据
     */
    void insertBalanceSheetRecordInfo(InsertBalanceSheetRecordRequest request);

    /**
     * 查询 收支记录 分页列表
     *
     * @param request 分页查询参数
     * @return 分页数据
     */
    PageResponse<QueryBalanceSheetRecordPageResponse> queryBalanceSheetRecordPage(QueryBalanceSheetRecordPageRequest request);

    /**
     * 删除一条 收支记录 数据
     *
     * @param id 数据ID
     */
    void deleteBalanceSheetRecordInfo(String id);
}
