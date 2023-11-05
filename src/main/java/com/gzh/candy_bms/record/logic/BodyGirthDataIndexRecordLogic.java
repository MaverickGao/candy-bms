package com.gzh.candy_bms.record.logic;

import com.gzh.candy_bms.record.bean.model.BodyGirthDataIndexRecordDO;
import com.gzh.candy_bms.record.dao.BodyGirthDataIndexRecordDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 体围指标记录表 Logic
 *
 * @author gaozhiheng
 */
@Component
public class BodyGirthDataIndexRecordLogic {

    @Resource
    private BodyGirthDataIndexRecordDao bodyGirthDataIndexRecordDao;

    /**
     * 新增 体围指标记录表 数据
     *
     * @param insertInfo 待新增数据
     */
    public void insertBodyGirthDataIndexInfo(BodyGirthDataIndexRecordDO insertInfo) {
        if (Objects.isNull(insertInfo)) {
            return;
        }
        bodyGirthDataIndexRecordDao.save(insertInfo);
    }
}
