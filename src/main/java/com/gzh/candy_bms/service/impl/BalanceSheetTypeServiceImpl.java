package com.gzh.candy_bms.service.impl;

import com.gzh.candy_bms.common.convert.BO2ResponseConvert;
import com.gzh.candy_bms.common.convert.Request2BOConvert;
import com.gzh.candy_bms.handler.BalanceSheetTypeHandler;
import com.gzh.candy_bms.pojo.request.InsertGeneralTypeRequest;
import com.gzh.candy_bms.pojo.request.InsertSubsidiaryTypeRequest;
import com.gzh.candy_bms.pojo.response.QueryGeneralTypeResponse;
import com.gzh.candy_bms.pojo.response.QuerySubsidiaryTypeResponse;
import com.gzh.candy_bms.service.BalanceSheetTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统用户登录 Service 实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Service
public class BalanceSheetTypeServiceImpl implements BalanceSheetTypeService {

    @Resource
    private BalanceSheetTypeHandler balanceSheetTypeHandler;

    @Resource
    private Request2BOConvert request2BOConvert;

    @Resource
    private BO2ResponseConvert bo2ResponseConvert;

    /**
     * 新增加一条 收支总类别 数据
     *
     * @param request 待新增数据
     */
    @Override
    public void insertGeneralTypeInfo(InsertGeneralTypeRequest request) {
        balanceSheetTypeHandler.insertGeneralTypeInfo(
                request2BOConvert.balanceSheetGeneralTypeRequest2BO(request)
        );
    }

    /**
     * 根据 收支总类别名称 查询 收支总类别列表
     *
     * @param generalTypeName 收支总类别名称
     * @param balanceType     收支标志
     * @return 收支总类别列表
     */
    @Override
    public List<QueryGeneralTypeResponse> queryGeneralTypeList(String generalTypeName, String balanceType) {
        return bo2ResponseConvert.queryGeneralTypeBO2ResponseList(
                balanceSheetTypeHandler.queryGeneralTypeList(generalTypeName, balanceType)
        );
    }

    /**
     * 新增加一条 收支细分类别 数据
     *
     * @param request 待新增数据
     */
    @Override
    public void insertSubsidiaryTypeInfo(InsertSubsidiaryTypeRequest request) {
        balanceSheetTypeHandler.insertSubsidiaryTypeInfo(
                request2BOConvert.balanceSheetSubsidiaryTypeRequest2BO(request)
        );
    }

    /**
     * 根据 收支细分类别名称 查询 收支细分类别列表
     *
     * @param generalTypeId      总类别ID
     * @param subsidiaryTypeName 细分类别名称
     * @param balanceType        收支标志；0-收入；1-支出
     * @return 收支细分类别列表
     */
    @Override
    public List<QuerySubsidiaryTypeResponse> querySubsidiaryTypeList(String generalTypeId, String subsidiaryTypeName, String balanceType) {
        return bo2ResponseConvert.querySubsidiaryTypeBO2ResponseList(
                balanceSheetTypeHandler.querySubsidiaryTypeList(generalTypeId, subsidiaryTypeName, balanceType)
        );
    }
}
