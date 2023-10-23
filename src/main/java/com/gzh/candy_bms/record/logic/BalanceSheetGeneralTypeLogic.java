package com.gzh.candy_bms.record.logic;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gzh.candy_bms.common.enums.DeleteFlagEnum;
import com.gzh.candy_bms.record.bean.model.BalanceSheetGeneralTypeDO;
import com.gzh.candy_bms.record.dao.BalanceSheetGeneralTypeDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
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

    /**
     * 根据 收支总类型名称 查询 收支总类别 数据
     *
     * @param typeName 收支总类型名称
     * @return 收支总类别 数据
     */
    public BalanceSheetGeneralTypeDO queryGeneralTypeByName(String typeName) {
        if (StringUtils.isBlank(typeName)) {
            return null;
        }
        return balanceSheetGeneralTypeDao.getOne(
                Wrappers.<BalanceSheetGeneralTypeDO>lambdaQuery()
                        .eq(BalanceSheetGeneralTypeDO::getTypeName, typeName)
                        .eq(BalanceSheetGeneralTypeDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .last("limit 1")
        );
    }

    /**
     * 查询 收支总类别 数据列表
     *
     * @param typeName    收支总类别名称
     * @param balanceType 收支标志
     * @return 收支总类别 数据列表
     */
    public List<BalanceSheetGeneralTypeDO> queryBalanceSheetGeneralTypeDOInfo(String typeName, String balanceType) {
        return balanceSheetGeneralTypeDao.list(
                Wrappers.<BalanceSheetGeneralTypeDO>lambdaQuery()
                        .like(StringUtils.isNotBlank(typeName), BalanceSheetGeneralTypeDO::getTypeName, typeName)
                        .eq(BalanceSheetGeneralTypeDO::getBalanceType, balanceType)
                        .eq(BalanceSheetGeneralTypeDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .orderByAsc(BalanceSheetGeneralTypeDO::getLastModifyTime)
        );
    }
}
