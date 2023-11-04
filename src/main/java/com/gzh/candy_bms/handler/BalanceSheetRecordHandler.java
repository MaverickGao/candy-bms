package com.gzh.candy_bms.handler;

import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.common.base.exception.BusinessException;
import com.gzh.candy_bms.common.base.exception.ReturnCode;
import com.gzh.candy_bms.common.convert.BO2DOConvert;
import com.gzh.candy_bms.common.convert.DO2BOConvert;
import com.gzh.candy_bms.common.enums.BalanceTypeEnum;
import com.gzh.candy_bms.common.enums.ExpensesEvaluationEnum;
import com.gzh.candy_bms.common.enums.SubsidiaryBalanceTypeEnum;
import com.gzh.candy_bms.pojo.request.QueryBalanceSheetRecordPageRequest;
import com.gzh.candy_bms.record.bean.bo.InsertBalanceSheetRecordBO;
import com.gzh.candy_bms.record.bean.bo.QueryBalanceSheetRecordPageBO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetRecordDO;
import com.gzh.candy_bms.record.logic.BalanceSheetGeneralTypeLogic;
import com.gzh.candy_bms.record.logic.BalanceSheetRecordLogic;
import com.gzh.candy_bms.record.logic.BalanceSheetSubsidiaryTypeLogic;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 收支记录表 Handler
 *
 * @author gaozhiheng
 */
@Slf4j
@Component
public class BalanceSheetRecordHandler {

    @Resource
    private BalanceSheetRecordLogic balanceSheetRecordLogic;

    @Resource
    private BO2DOConvert bo2DOConvert;

    @Resource
    private DO2BOConvert do2BOConvert;

    @Resource
    private BalanceSheetSubsidiaryTypeLogic balanceSheetSubsidiaryTypeLogic;

    @Resource
    private BalanceSheetGeneralTypeLogic balanceSheetGeneralTypeLogic;

    /**
     * 插入一条 收支记录 数据
     *
     * @param recordBO 待新增数据
     */
    public void insertBalanceSheetRecordInfo(InsertBalanceSheetRecordBO recordBO) {
        // 入参校验
        checkInsertParam(recordBO);
        // 新增数据
        balanceSheetRecordLogic.insertBalanceSheetRecordInfo(
                bo2DOConvert.balanceSheetRecordBO2DO(recordBO)
        );
    }

    /**
     * 删除一条 收支记录 数据
     *
     * @param id 数据ID
     */
    public void deleteBalanceSheetRecordInfo(String id) {
        if (StringUtils.isBlank(id)) {
            throw new BusinessException(ReturnCode.PARAMETERS_ERROR);
        }
        // 根据ID查询 收支记录表数据
        BalanceSheetRecordDO balanceSheetRecordDO = balanceSheetRecordLogic.queryBalanceSheetRecordById(id);
        if (Objects.isNull(balanceSheetRecordDO)) {
            log.warn("当前ID：{}的数据不存在，删除失败", id);
            throw new BusinessException(ReturnCode.DELETE_BALANCE_SHEET_RECORD_ERROR);
        }
        balanceSheetRecordLogic.deleteBalanceSheetRecordById(balanceSheetRecordDO);
    }

    /**
     * 新增 收支记录 入参校验
     *
     * @param recordBO 待新增数据
     */
    private void checkInsertParam(InsertBalanceSheetRecordBO recordBO) {
        if (Objects.isNull(recordBO)) {
            throw new BusinessException(ReturnCode.PARAMETERS_ERROR);
        }
    }

    /**
     * 查询 收支记录 分页列表
     *
     * @param request 分页入参
     * @return 分页数据
     */
    public PageResponse<QueryBalanceSheetRecordPageBO> queryBalanceSheetRecordPage(QueryBalanceSheetRecordPageRequest request) {
        // 分页查询数据
        PageResponse<BalanceSheetRecordDO> pageDO = balanceSheetRecordLogic.queryBalanceSheetRecordPageInfo(request);
        // 转换数据类型
        PageResponse<QueryBalanceSheetRecordPageBO> result = do2BOConvert.balanceSheetRecordDO2PageBOPage(pageDO);
        // 组装分页数据
        if (Objects.nonNull(result) && CollectionUtils.isNotEmpty(result.getData())) {
            List<QueryBalanceSheetRecordPageBO> data = result.getData();
            // 准备 收支总类别ID列表
            List<String> generalTypeIdList = data.stream()
                    .filter(e -> Objects.nonNull(e) && StringUtils.isNotBlank(e.getGeneralTypeId()))
                    .map(QueryBalanceSheetRecordPageBO::getGeneralTypeId)
                    .collect(Collectors.toList());
            Map<String, String> generalTypeMap = balanceSheetGeneralTypeLogic.queryGeneralTypeMap(generalTypeIdList);

            // 准备 收支细分类别ID列表
            List<String> subsidiaryTypeIdList = data.stream()
                    .filter(e -> Objects.nonNull(e) && StringUtils.isNotBlank(e.getSubsidiaryTypeId()))
                    .map(QueryBalanceSheetRecordPageBO::getSubsidiaryTypeId)
                    .collect(Collectors.toList());
            Map<String, String> subsidiaryTypeMap = balanceSheetSubsidiaryTypeLogic.querySubsidiaryTypeMap(subsidiaryTypeIdList);

            data.forEach(e -> {
                e.setBalanceTypeCN(BalanceTypeEnum.getNameByCode(e.getBalanceType()));
                e.setSubsidiaryBalanceTypeCN(SubsidiaryBalanceTypeEnum.getNameByCode(e.getSubsidiaryBalanceType()));
                e.setGeneralTypeName(generalTypeMap.get(e.getGeneralTypeId()));
                e.setSubsidiaryTypeName(subsidiaryTypeMap.get(e.getSubsidiaryTypeId()));
                e.setBalanceAmountFmt(e.getBalanceAmount().toPlainString());
                e.setExpensesEvaluationCN(ExpensesEvaluationEnum.getNameByCode(e.getExpensesEvaluation()));
            });
            result.setData(data);
        }
        return result;
    }
}
