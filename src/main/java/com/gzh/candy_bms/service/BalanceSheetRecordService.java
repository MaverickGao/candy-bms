package com.gzh.candy_bms.service;

import com.gzh.candy_bms.pojo.request.InsertBalanceSheetRecordRequest;

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
}
