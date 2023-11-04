package com.gzh.candy_bms.handler;

import com.gzh.candy_bms.record.logic.BodyGirthDataIndexRecordLogic;
import com.gzh.candy_bms.record.logic.PhysicalDataIndexRecordLogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 身体指标管理 Handler
 *
 * @author gaozhiheng
 */
@Slf4j
@Component
public class BodyIndexRecordHandler {

    @Resource
    private BodyGirthDataIndexRecordLogic bodyGirthDataIndexRecordLogic;

    @Resource
    private PhysicalDataIndexRecordLogic physicalDataIndexRecordLogic;
}
