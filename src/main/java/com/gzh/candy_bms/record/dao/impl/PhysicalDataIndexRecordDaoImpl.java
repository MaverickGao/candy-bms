package com.gzh.candy_bms.record.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gzh.candy_bms.record.bean.model.PhysicalDataIndexRecordDO;
import com.gzh.candy_bms.record.dao.PhysicalDataIndexRecordDao;
import com.gzh.candy_bms.record.mapper.PhysicalDataIndexRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * 体征指标记录表 Dao实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Repository
public class PhysicalDataIndexRecordDaoImpl extends ServiceImpl<PhysicalDataIndexRecordMapper, PhysicalDataIndexRecordDO> implements PhysicalDataIndexRecordDao {
}
