package com.gzh.candy_bms.record.logic;

import com.gzh.candy_bms.record.bean.model.PhysicalDataIndexRecordDO;
import com.gzh.candy_bms.record.dao.PhysicalDataIndexRecordDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 体征指标记录表 Logic
 *
 * @author gaozhiheng
 */
@Component
public class PhysicalDataIndexRecordLogic {

    @Resource
    private PhysicalDataIndexRecordDao physicalDataIndexRecordDao;

    /**
     * 新增 体征指标记录表数据
     *
     * @param indexRecordDO 待新增数据
     */
    public void insertPhysicalDataIndexInfo(PhysicalDataIndexRecordDO indexRecordDO) {
        if (Objects.isNull(indexRecordDO)) {
            return;
        }
        physicalDataIndexRecordDao.save(indexRecordDO);
    }
}
