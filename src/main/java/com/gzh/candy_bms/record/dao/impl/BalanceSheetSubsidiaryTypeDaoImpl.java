package com.gzh.candy_bms.record.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gzh.candy_bms.record.bean.model.BalanceSheetSubsidiaryTypeDO;
import com.gzh.candy_bms.record.dao.BalanceSheetSubsidiaryTypeDao;
import com.gzh.candy_bms.record.mapper.BalanceSheetSubsidiaryTypeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * 收支细分类别 Dao实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Repository
public class BalanceSheetSubsidiaryTypeDaoImpl extends ServiceImpl<BalanceSheetSubsidiaryTypeMapper, BalanceSheetSubsidiaryTypeDO> implements BalanceSheetSubsidiaryTypeDao {
}
