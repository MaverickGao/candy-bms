package com.gzh.candy_bms.tencentcloud.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gzh.candy_bms.tencentcloud.bean.model.TencentVideoStorageHistoryDO;
import com.gzh.candy_bms.tencentcloud.dao.TencentVideoStorageHistoryDao;
import com.gzh.candy_bms.tencentcloud.mapper.TencentVideoStorageHistoryMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * 腾讯云点播上传历史表 Dao实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Repository
public class TencentVideoStorageHistoryDaoImpl extends ServiceImpl<TencentVideoStorageHistoryMapper, TencentVideoStorageHistoryDO> implements TencentVideoStorageHistoryDao {
}
