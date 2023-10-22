package com.gzh.candy_bms.record.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gzh.candy_bms.record.bean.model.BalanceSheetRecordDO;
import com.gzh.candy_bms.record.dao.BalanceSheetRecordDao;
import com.gzh.candy_bms.record.mapper.BalanceSheetRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * 收支记录表 Dao实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Repository
public class BalanceSheetRecordDaoImpl extends ServiceImpl<BalanceSheetRecordMapper, BalanceSheetRecordDO> implements BalanceSheetRecordDao {
}
