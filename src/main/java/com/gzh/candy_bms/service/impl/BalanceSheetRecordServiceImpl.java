package com.gzh.candy_bms.service.impl;

import com.gzh.candy_bms.common.convert.Request2BOConvert;
import com.gzh.candy_bms.handler.BalanceSheetRecordHandler;
import com.gzh.candy_bms.pojo.request.InsertBalanceSheetRecordRequest;
import com.gzh.candy_bms.service.BalanceSheetRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 收支记录表 Service 实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Service
public class BalanceSheetRecordServiceImpl implements BalanceSheetRecordService {

    @Resource
    private BalanceSheetRecordHandler balanceSheetRecordHandler;

    @Resource
    private Request2BOConvert request2BOConvert;

    /**
     * 插入一条 收支记录 数据
     *
     * @param request 待新增数据
     */
    @Override
    public void insertBalanceSheetRecordInfo(InsertBalanceSheetRecordRequest request) {
        balanceSheetRecordHandler.insertBalanceSheetRecordInfo(
                request2BOConvert.insertBalanceSheetRecordRequest2BO(request)
        );
    }
}
