package com.gzh.candy_bms.record.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gzh.candy_bms.record.bean.model.BodyGirthDataIndexRecordDO;
import com.gzh.candy_bms.record.dao.BodyGirthDataIndexRecordDao;
import com.gzh.candy_bms.record.mapper.BodyGirthDataIndexRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * 体围指标记录表 Dao实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Repository
public class BodyGirthDataIndexRecordDaoImpl extends ServiceImpl<BodyGirthDataIndexRecordMapper, BodyGirthDataIndexRecordDO> implements BodyGirthDataIndexRecordDao {
}
