package com.gzh.candy_bms.record.logic;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gzh.candy_bms.common.enums.DeleteFlagEnum;
import com.gzh.candy_bms.record.bean.model.BalanceSheetGeneralTypeDO;
import com.gzh.candy_bms.record.dao.BalanceSheetGeneralTypeDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 收支总类别 Logic
 *
 * @author gaozhiheng
 */
@Component
public class BalanceSheetGeneralTypeLogic {

    @Resource
    private BalanceSheetGeneralTypeDao balanceSheetGeneralTypeDao;

    /**
     * 新增 收支总类别 数据
     *
     * @param generalTypeDO 待新增数据
     */
    public void insertGeneralTypeInfo(BalanceSheetGeneralTypeDO generalTypeDO) {
        if (Objects.isNull(generalTypeDO)) {
            return;
        }
        balanceSheetGeneralTypeDao.save(generalTypeDO);
    }

    /**
     * 根据ID查询 收支总类别 数据
     *
     * @param id 收支总类别ID
     * @return 收支总类别 数据
     */
    public BalanceSheetGeneralTypeDO queryGeneralTypeById(String id) {
        if (StringUtils.isBlank(id)) {
            return null;
        }
        return balanceSheetGeneralTypeDao.getOne(
                Wrappers.<BalanceSheetGeneralTypeDO>lambdaQuery()
                        .eq(BalanceSheetGeneralTypeDO::getId, id)
                        .eq(BalanceSheetGeneralTypeDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .last("limit 1")
        );
    }
}
