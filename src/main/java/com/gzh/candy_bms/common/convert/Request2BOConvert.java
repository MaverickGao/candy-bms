package com.gzh.candy_bms.common.convert;

import com.gzh.candy_bms.pojo.request.*;
import com.gzh.candy_bms.record.bean.bo.*;
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

    /**
     * InsertBalanceSheetRecord Request 转 BO
     *
     * @param request {@link InsertBalanceSheetRecordRequest}
     * @return {@link InsertBalanceSheetRecordBO}
     */
    InsertBalanceSheetRecordBO insertBalanceSheetRecordRequest2BO(InsertBalanceSheetRecordRequest request);

    /**
     * InsertPhysicalIndexRecord Request 转 BO
     *
     * @param request {@link InsertPhysicalIndexRecordRequest}
     * @return {@link InsertPhysicalIndexRecordBO}
     */
    InsertPhysicalIndexRecordBO insertPhysicalIndexRecordRequest2BO(InsertPhysicalIndexRecordRequest request);

    /**
     * InsertBodyGirthIndexRecord Request 转 BO
     *
     * @param request {@link InsertBodyGirthIndexRecordRequest}
     * @return {@link InsertBodyGirthIndexRecordBO}
     */
    InsertBodyGirthIndexRecordBO insertBodyGirthIndexRecordRequest2BO(InsertBodyGirthIndexRecordRequest request);
}
