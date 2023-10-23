package com.gzh.candy_bms.service.impl;

import com.gzh.candy_bms.common.convert.Request2BOConvert;
import com.gzh.candy_bms.handler.BalanceSheetTypeHandler;
import com.gzh.candy_bms.pojo.request.InsertGeneralTypeRequest;
import com.gzh.candy_bms.service.BalanceSheetTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统用户登录 Service 实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Service
public class BalanceSheetTypeServiceImpl implements BalanceSheetTypeService {

    @Resource
    private BalanceSheetTypeHandler balanceSheetTypeHandler;

    @Resource
    private Request2BOConvert convert;

    /**
     * 新增加一条 收支总类别 数据
     *
     * @param request 待新增数据
     */
    @Override
    public void insertGeneralTypeInfo(InsertGeneralTypeRequest request) {
        balanceSheetTypeHandler.insertGeneralTypeInfo(
                convert.balanceSheetGeneralTypeRequest2BO(request)
        );
    }
}
