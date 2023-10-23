package com.gzh.candy_bms.service;

import com.gzh.candy_bms.pojo.request.InsertGeneralTypeRequest;

/**
 * 收支类型管理 逻辑层
 *
 * @author gaozhiheng
 */
public interface BalanceSheetTypeService {

    /**
     * 新增加一条 收支总类别 数据
     *
     * @param request 待新增数据
     */
    void insertGeneralTypeInfo(InsertGeneralTypeRequest request);
}
