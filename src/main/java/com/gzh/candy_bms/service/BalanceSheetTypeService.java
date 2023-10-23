package com.gzh.candy_bms.service;

import com.gzh.candy_bms.pojo.request.InsertGeneralTypeRequest;
import com.gzh.candy_bms.pojo.response.QueryGeneralTypeResponse;

import java.util.List;

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

    /**
     * 根据 收支总类别名称 查询 收支总类别列表
     *
     * @param generalTypeName 收支总类别名称
     * @param balanceType     收支标志
     * @return 收支总类别列表
     */
    List<QueryGeneralTypeResponse> queryGeneralTypeList(String generalTypeName, String balanceType);
}
