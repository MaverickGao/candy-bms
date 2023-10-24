package com.gzh.candy_bms.common.convert;

import com.gzh.candy_bms.pojo.request.InsertGeneralTypeRequest;
import com.gzh.candy_bms.pojo.request.InsertSubsidiaryTypeRequest;
import com.gzh.candy_bms.record.bean.bo.BalanceSheetGeneralTypeBO;
import com.gzh.candy_bms.record.bean.bo.BalanceSheetSubsidiaryTypeBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Request转BO
 *
 * @author gaozhiheng
 */
@Mapper(componentModel = "spring")
public interface Request2BOConvert {

    Request2BOConvert INSTANCE = Mappers.getMapper(Request2BOConvert.class);

    /**
     * InsertGeneralType Request 转 BO
     *
     * @param request {@link InsertGeneralTypeRequest}
     * @return {@link BalanceSheetGeneralTypeBO}
     */
    BalanceSheetGeneralTypeBO balanceSheetGeneralTypeRequest2BO(InsertGeneralTypeRequest request);

    /**
     * InsertSubsidiaryType Request 转 BO
     *
     * @param request {@link InsertSubsidiaryTypeRequest}
     * @return {@link BalanceSheetSubsidiaryTypeBO}
     */
    BalanceSheetSubsidiaryTypeBO balanceSheetSubsidiaryTypeRequest2BO(InsertSubsidiaryTypeRequest request);
}
