package com.gzh.candy_bms.handler;

import com.gzh.candy_bms.common.base.exception.BusinessException;
import com.gzh.candy_bms.common.base.exception.ReturnCode;
import com.gzh.candy_bms.common.convert.BO2DOConvert;
import com.gzh.candy_bms.record.bean.bo.InsertBodyGirthIndexRecordBO;
import com.gzh.candy_bms.record.bean.bo.InsertPhysicalIndexRecordBO;
import com.gzh.candy_bms.record.logic.BodyGirthDataIndexRecordLogic;
import com.gzh.candy_bms.record.logic.PhysicalDataIndexRecordLogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

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

    @Resource
    private BO2DOConvert bo2DOConvert;

    /**
     * 新增 体征指标管理 数据
     *
     * @param insertPhysicalIndexRecordBO 待新增数据
     */
    public void insertPhysicalIndexRecordInfo(InsertPhysicalIndexRecordBO insertPhysicalIndexRecordBO) {
        if (Objects.isNull(insertPhysicalIndexRecordBO)) {
            throw new BusinessException(ReturnCode.PARAMETERS_ERROR);
        }
        physicalDataIndexRecordLogic.insertPhysicalDataIndexInfo(
                bo2DOConvert.insertPhysicalIndexRecordBO2DO(insertPhysicalIndexRecordBO)
        );
    }

    /**
     * 新增 体围指标管理 数据
     *
     * @param insertBodyGirthIndexRecordBO 待新增数据
     */
    public void insertBodyGirthIndexRecordInfo(InsertBodyGirthIndexRecordBO insertBodyGirthIndexRecordBO) {
        if (Objects.isNull(insertBodyGirthIndexRecordBO)) {
            throw new BusinessException(ReturnCode.PARAMETERS_ERROR);
        }
        bodyGirthDataIndexRecordLogic.insertBodyGirthDataIndexInfo(
                bo2DOConvert.insertBodyGirthIndexRecordBO2DO(insertBodyGirthIndexRecordBO)
        );
    }
}
