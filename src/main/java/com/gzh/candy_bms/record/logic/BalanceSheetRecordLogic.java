package com.gzh.candy_bms.record.logic;

import com.gzh.candy_bms.record.bean.model.BalanceSheetRecordDO;
import com.gzh.candy_bms.record.dao.BalanceSheetRecordDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 收支记录表 Logic
 *
 * @author gaozhiheng
 */
@Component
public class BalanceSheetRecordLogic {

    @Resource
    private BalanceSheetRecordDao balanceSheetRecordDao;

    /**
     * 新增一条 收支记录表 数据
     *
     * @param balanceSheetRecordDO 待新增数据
     */
    public void insertBalanceSheetRecordInfo(BalanceSheetRecordDO balanceSheetRecordDO) {
        if (Objects.isNull(balanceSheetRecordDO)) {
            return;
        }
        balanceSheetRecordDao.save(balanceSheetRecordDO);
    }
}
