package com.gzh.candy_bms.handler;

import com.gzh.candy_bms.common.base.exception.BusinessException;
import com.gzh.candy_bms.common.base.exception.ReturnCode;
import com.gzh.candy_bms.common.convert.BO2DOConvert;
import com.gzh.candy_bms.record.bean.bo.BalanceSheetGeneralTypeBO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetGeneralTypeDO;
import com.gzh.candy_bms.record.logic.BalanceSheetGeneralTypeLogic;
import com.gzh.candy_bms.record.logic.BalanceSheetSubsidiaryTypeLogic;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 收支类型管理 Handler
 *
 * @author gaozhiheng
 */
@Slf4j
@Component
public class BalanceSheetTypeHandler {

    @Resource
    private BalanceSheetGeneralTypeLogic balanceSheetGeneralTypeLogic;

    @Resource
    private BalanceSheetSubsidiaryTypeLogic balanceSheetSubsidiaryTypeLogic;

    @Resource
    private BO2DOConvert bo2DOConvert;

    /**
     * 新增加一条 收支总类别 数据
     *
     * @param generalTypeBO 待新增数据
     */
    @Transactional
    public void insertGeneralTypeInfo(BalanceSheetGeneralTypeBO generalTypeBO) {
        // 入参校验
        insertGeneralTypeCheck(generalTypeBO);
        // 新增数据
        balanceSheetGeneralTypeLogic.insertGeneralTypeInfo(
                bo2DOConvert.balanceSheetGeneralTypeBO2DO(generalTypeBO)
        );
    }

    /**
     * 新增 参数校验
     *
     * @param generalTypeBO 待新增数据
     */
    private void insertGeneralTypeCheck(BalanceSheetGeneralTypeBO generalTypeBO) {
        if (Objects.isNull(generalTypeBO) || StringUtils.isBlank(generalTypeBO.getTypeName())) {
            throw new BusinessException(ReturnCode.PARAMETERS_ERROR);
        }
        // 检查 总类型 名称是否重复
        BalanceSheetGeneralTypeDO generalTypeDO = balanceSheetGeneralTypeLogic
                .queryGeneralTypeByName(generalTypeBO.getTypeName());
        if (Objects.nonNull(generalTypeDO)) {
            log.warn("新增收支总类别数据失败，{}总类别已存在", generalTypeDO.getTypeName());
            throw new BusinessException(ReturnCode.INSERT_GENERAL_TYPE_ERROR);
        }
    }
}
