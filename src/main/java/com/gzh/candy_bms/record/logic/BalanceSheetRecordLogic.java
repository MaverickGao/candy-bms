package com.gzh.candy_bms.record.logic;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.common.base.Pages;
import com.gzh.candy_bms.common.enums.DeleteFlagEnum;
import com.gzh.candy_bms.pojo.request.QueryBalanceSheetRecordPageRequest;
import com.gzh.candy_bms.record.bean.model.BalanceSheetRecordDO;
import com.gzh.candy_bms.record.dao.BalanceSheetRecordDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 收支记录表 Logic
 *
 * @author gaozhiheng
 */
@Component
public class BalanceSheetRecordLogic {

    @Resource
    private BalanceSheetRecordDao balanceSheetRecordDao;

    /**
     * 新增一条 收支记录表 数据
     *
     * @param balanceSheetRecordDO 待新增数据
     */
    public void insertBalanceSheetRecordInfo(BalanceSheetRecordDO balanceSheetRecordDO) {
        if (Objects.isNull(balanceSheetRecordDO)) {
            return;
        }
        balanceSheetRecordDao.save(balanceSheetRecordDO);
    }

    /**
     * 删除 收支记录表数据
     *
     * @param balanceSheetRecordDO 待删除数据
     */
    public void deleteBalanceSheetRecordById(BalanceSheetRecordDO balanceSheetRecordDO) {
        if (Objects.isNull(balanceSheetRecordDO)) {
            return;
        }
        balanceSheetRecordDO.setDeleteFlag(DeleteFlagEnum.UN_DELETED.getCode());
        balanceSheetRecordDao.updateById(balanceSheetRecordDO);
    }

    /**
     * 根据ID 查询 收支记录表数据
     *
     * @param id 数据ID
     * @return 收支记录表数据
     */
    public BalanceSheetRecordDO queryBalanceSheetRecordById(String id) {
        if (StringUtils.isBlank(id)) {
            return null;
        }
        return balanceSheetRecordDao.getOne(
                Wrappers.<BalanceSheetRecordDO>lambdaQuery()
                        .eq(BalanceSheetRecordDO::getId, id)
                        .eq(BalanceSheetRecordDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .last("limit 1")
        );
    }

    /**
     * 分页查询 收支记录表 数据
     *
     * @param request 分页入参
     * @return 分页数据
     */
    public PageResponse<BalanceSheetRecordDO> queryBalanceSheetRecordPageInfo(QueryBalanceSheetRecordPageRequest request) {
        // 分页查询
        return Pages.query(() ->
                balanceSheetRecordDao.page(
                        new Page<>(request.getPageNum(), request.getPageSize()),
                        Wrappers.<BalanceSheetRecordDO>lambdaQuery()
                                .eq(StringUtils.isNotBlank(request.getRecordDate()), BalanceSheetRecordDO::getRecordDate, request.getRecordDate())
                                .eq(StringUtils.isNotBlank(request.getBalanceType()), BalanceSheetRecordDO::getBalanceType, request.getBalanceType())
                                .eq(StringUtils.isNotBlank(request.getSubsidiaryBalanceType()), BalanceSheetRecordDO::getSubsidiaryBalanceType, request.getSubsidiaryBalanceType())
                                .eq(StringUtils.isNotBlank(request.getGeneralTypeId()), BalanceSheetRecordDO::getGeneralTypeId, request.getGeneralTypeId())
                                .eq(StringUtils.isNotBlank(request.getSubsidiaryTypeId()), BalanceSheetRecordDO::getSubsidiaryTypeId, request.getSubsidiaryTypeId())
                                .eq(StringUtils.isNotBlank(request.getExpensesEvaluation()), BalanceSheetRecordDO::getExpensesEvaluation, request.getExpensesEvaluation())
                                .eq(BalanceSheetRecordDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                                .orderByDesc(BalanceSheetRecordDO::getRecordDate)
                                .orderByDesc(BalanceSheetRecordDO::getLastModifyTime)
                                .orderByAsc(BalanceSheetRecordDO::getId)
                ));
    }
}