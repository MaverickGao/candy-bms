package com.gzh.candy_bms.record.logic;

import com.gzh.candy_bms.record.dao.PhysicalDataIndexRecordDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 体征指标记录表 Logic
 *
 * @author gaozhiheng
 */
@Component
public class PhysicalDataIndexRecordLogic {

    @Resource
    private PhysicalDataIndexRecordDao physicalDataIndexRecordDao;
}
