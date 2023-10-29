package com.gzh.candy_bms.record.logic;

import com.gzh.candy_bms.record.dao.BodyGirthDataIndexRecordDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 体围指标记录表 Logic
 *
 * @author gaozhiheng
 */
@Component
public class BodyGirthDataIndexRecordLogic {

    @Resource
    private BodyGirthDataIndexRecordDao bodyGirthDataIndexRecordDao;
}
