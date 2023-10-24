package com.gzh.candy_bms.record.logic;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gzh.candy_bms.common.enums.DeleteFlagEnum;
import com.gzh.candy_bms.record.bean.model.BalanceSheetSubsidiaryTypeDO;
import com.gzh.candy_bms.record.dao.BalanceSheetSubsidiaryTypeDao;
import com.lark.oapi.core.utils.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 收支细分类别 Logic
 *
 * @author gaozhiheng
 */
@Component
public class BalanceSheetSubsidiaryTypeLogic {

    @Resource
    private BalanceSheetSubsidiaryTypeDao balanceSheetSubsidiaryTypeDao;

    /**
     * 新增 收支细分类别 数据
     *
     * @param subsidiaryTypeDO 待新增数据
     */
    public void insertSubsidiaryTypeInfo(BalanceSheetSubsidiaryTypeDO subsidiaryTypeDO) {
        if (Objects.isNull(subsidiaryTypeDO)) {
            return;
        }
        balanceSheetSubsidiaryTypeDao.save(subsidiaryTypeDO);
    }

    /**
     * 根据ID查询 收支细分类别 数据
     *
     * @param id 收支细分类别ID
     * @return 收支细分类别 数据
     */
    public BalanceSheetSubsidiaryTypeDO querySubsidiaryTypeById(String id) {
        if (StringUtils.isBlank(id)) {
            return null;
        }
        return balanceSheetSubsidiaryTypeDao.getOne(
                Wrappers.<BalanceSheetSubsidiaryTypeDO>lambdaQuery()
                        .eq(BalanceSheetSubsidiaryTypeDO::getId, id)
                        .eq(BalanceSheetSubsidiaryTypeDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .last("limit 1")
        );
    }

    /**
     * 根据 收支总类别ID 查询 收支细分类别 数据列表
     *
     * @param generalId   收支总类别ID
     * @param typeName    收支细分类别名称
     * @param balanceType 收支标志
     * @return 收支细分类别 数据列表
     */
    public List<BalanceSheetSubsidiaryTypeDO> querySubsidiaryTypeListByGeneralId(String generalId, String typeName, String balanceType) {
        if (StringUtils.isBlank(generalId)) {
            return Lists.newArrayList();
        }
        return balanceSheetSubsidiaryTypeDao.list(
                Wrappers.<BalanceSheetSubsidiaryTypeDO>lambdaQuery()
                        .eq(BalanceSheetSubsidiaryTypeDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .eq(BalanceSheetSubsidiaryTypeDO::getGeneralTypeId, generalId)
                        .eq(BalanceSheetSubsidiaryTypeDO::getBalanceType, balanceType)
                        .like(StringUtils.isNotBlank(typeName), BalanceSheetSubsidiaryTypeDO::getTypeName, typeName)
                        .orderByAsc(BalanceSheetSubsidiaryTypeDO::getTypeName)
        );
    }

    /**
     * 根据 细分类别名称 查询 收支细分类别 数据
     *
     * @param typeName 细分类别名称
     * @return 收支细分类别 数据
     */
    public BalanceSheetSubsidiaryTypeDO querySubsidiaryTypeByName(String typeName) {
        if (StringUtils.isBlank(typeName)) {
            return null;
        }
        return balanceSheetSubsidiaryTypeDao.getOne(
                Wrappers.<BalanceSheetSubsidiaryTypeDO>lambdaQuery()
                        .eq(BalanceSheetSubsidiaryTypeDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .eq(BalanceSheetSubsidiaryTypeDO::getTypeName, typeName)
                        .last("limit 1")
        );
    }
}
