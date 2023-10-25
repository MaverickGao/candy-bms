package com.gzh.candy_bms.handler;

import com.gzh.candy_bms.common.base.exception.BusinessException;
import com.gzh.candy_bms.common.base.exception.ReturnCode;
import com.gzh.candy_bms.common.convert.BO2DOConvert;
import com.gzh.candy_bms.record.bean.bo.InsertBalanceSheetRecordBO;
import com.gzh.candy_bms.record.logic.BalanceSheetRecordLogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 收支记录表 Handler
 *
 * @author gaozhiheng
 */
@Slf4j
@Component
public class BalanceSheetRecordHandler {

    @Resource
    private BalanceSheetRecordLogic balanceSheetRecordLogic;

    @Resource
    private BO2DOConvert bo2DOConvert;

    /**
     * 插入一条 收支记录 数据
     *
     * @param recordBO 待新增数据
     */
    public void insertBalanceSheetRecordInfo(InsertBalanceSheetRecordBO recordBO) {
        // 入参校验
        checkInsertParam(recordBO);
        // 新增数据
        balanceSheetRecordLogic.insertBalanceSheetRecordInfo(
                bo2DOConvert.balanceSheetRecordBO2DO(recordBO)
        );
    }

    /**
     * 新增 收支记录 入参校验
     *
     * @param recordBO 待新增数据
     */
    private void checkInsertParam(InsertBalanceSheetRecordBO recordBO) {
        if (Objects.isNull(recordBO)) {
            throw new BusinessException(ReturnCode.PARAMETERS_ERROR);
        }
    }
}
