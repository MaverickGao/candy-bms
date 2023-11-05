package com.gzh.candy_bms.common.convert;

import com.gzh.candy_bms.record.bean.bo.*;
import com.gzh.candy_bms.record.bean.model.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * BO转DO
 *
 * @author gaozhiheng
 */
@Mapper(componentModel = "spring")
public interface BO2DOConvert {

    BO2DOConvert INSTANCE = Mappers.getMapper(BO2DOConvert.class);

    /**
     * BalanceSheetGeneralType BO 转 DO
     *
     * @param balanceSheetGeneralTypeBO {@link BalanceSheetGeneralTypeBO}
     * @return {@link BalanceSheetGeneralTypeDO}
     */
    BalanceSheetGeneralTypeDO balanceSheetGeneralTypeBO2DO(BalanceSheetGeneralTypeBO balanceSheetGeneralTypeBO);

    /**
     * BalanceSheetSubsidiaryType BO 转 DO
     *
     * @param balanceSheetSubsidiaryTypeBO {@link BalanceSheetSubsidiaryTypeBO}
     * @return {@link BalanceSheetSubsidiaryTypeDO}
     */
    BalanceSheetSubsidiaryTypeDO balanceSheetSubsidiaryTypeBO2DO(BalanceSheetSubsidiaryTypeBO balanceSheetSubsidiaryTypeBO);

    /**
     * InsertBalanceSheetRecord BO 转 DO
     *
     * @param balanceSheetRecordBO {@link InsertBalanceSheetRecordBO}
     * @return {@link BalanceSheetRecordDO}
     */
    BalanceSheetRecordDO balanceSheetRecordBO2DO(InsertBalanceSheetRecordBO balanceSheetRecordBO);

    /**
     * InsertPhysicalIndexRecord BO 转 DO
     *
     * @param insertPhysicalIndexRecordBO {@link InsertPhysicalIndexRecordBO}
     * @return {@link PhysicalDataIndexRecordDO}
     */
    PhysicalDataIndexRecordDO insertPhysicalIndexRecordBO2DO(InsertPhysicalIndexRecordBO insertPhysicalIndexRecordBO);

    /**
     * InsertBodyGirthIndexRecord BO 转 DO
     *
     * @param insertBodyGirthIndexRecordBO {@link InsertBodyGirthIndexRecordBO}
     * @return {@link BodyGirthDataIndexRecordDO}
     */
    BodyGirthDataIndexRecordDO insertBodyGirthIndexRecordBO2DO(InsertBodyGirthIndexRecordBO insertBodyGirthIndexRecordBO);
}
