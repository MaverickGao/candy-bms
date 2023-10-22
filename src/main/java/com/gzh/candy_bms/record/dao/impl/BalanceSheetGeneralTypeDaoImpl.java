package com.gzh.candy_bms.record.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gzh.candy_bms.record.bean.model.BalanceSheetGeneralTypeDO;
import com.gzh.candy_bms.record.dao.BalanceSheetGeneralTypeDao;
import com.gzh.candy_bms.record.mapper.BalanceSheetGeneralTypeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * 收支总类别 Dao实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Repository
public class BalanceSheetGeneralTypeDaoImpl extends ServiceImpl<BalanceSheetGeneralTypeMapper, BalanceSheetGeneralTypeDO> implements BalanceSheetGeneralTypeDao {
}
