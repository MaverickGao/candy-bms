package com.gzh.candy_bms.handler;

import com.gzh.candy_bms.common.base.exception.BusinessException;
import com.gzh.candy_bms.common.base.exception.ReturnCode;
import com.gzh.candy_bms.common.convert.BO2DOConvert;
import com.gzh.candy_bms.record.bean.bo.InsertBalanceSheetRecordBO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetRecordDO;
import com.gzh.candy_bms.record.logic.BalanceSheetRecordLogic;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
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
     * 删除一条 收支记录 数据
     *
     * @param id 数据ID
     */
    public void deleteBalanceSheetRecordInfo(String id) {
        if (StringUtils.isBlank(id)) {
            throw new BusinessException(ReturnCode.PARAMETERS_ERROR);
        }
        // 根据ID查询 收支记录表数据
        BalanceSheetRecordDO balanceSheetRecordDO = balanceSheetRecordLogic.queryBalanceSheetRecordById(id);
        if (Objects.isNull(balanceSheetRecordDO)) {
            log.warn("当前ID：{}的数据不存在，删除失败", id);
            throw new BusinessException(ReturnCode.DELETE_BALANCE_SHEET_RECORD_ERROR);
        }
        balanceSheetRecordLogic.deleteBalanceSheetRecordById(balanceSheetRecordDO);
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
