package com.gzh.candy_bms.record.logic;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.google.common.collect.Maps;
import com.gzh.candy_bms.common.enums.DeleteFlagEnum;
import com.gzh.candy_bms.record.bean.model.BalanceSheetGeneralTypeDO;
import com.gzh.candy_bms.record.dao.BalanceSheetGeneralTypeDao;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
                        .orderByAsc(BalanceSheetGeneralTypeDO::getTypeName)
        );
    }

    /**
     * 查询 总类别 词典
     *
     * @param idList 总类别ID列表
     * @return 总类别 词典
     */
    public Map<String, String> queryGeneralTypeMap(List<String> idList) {
        if (CollectionUtils.isEmpty(idList)) {
            return Maps.newHashMap();
        }
        List<BalanceSheetGeneralTypeDO> list = balanceSheetGeneralTypeDao.list(
                Wrappers.<BalanceSheetGeneralTypeDO>lambdaQuery()
                        .in(BalanceSheetGeneralTypeDO::getId, idList)
                        .eq(BalanceSheetGeneralTypeDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .orderByAsc(BalanceSheetGeneralTypeDO::getTypeName)
        );
        if (CollectionUtils.isEmpty(list)) {
            return Maps.newHashMap();
        }
        return list.stream()
                .filter(e -> Objects.nonNull(e) && StringUtils.isNotBlank(e.getId()) && StringUtils.isNotBlank(e.getTypeName()))
                .collect(HashMap::new, (map, item) ->
                        map.put(item.getId(), item.getTypeName()), HashMap::putAll);
    }
}
