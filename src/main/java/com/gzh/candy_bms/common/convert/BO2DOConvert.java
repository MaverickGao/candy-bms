package com.gzh.candy_bms.common.convert;

import com.gzh.candy_bms.record.bean.bo.BalanceSheetGeneralTypeBO;
import com.gzh.candy_bms.record.bean.bo.BalanceSheetSubsidiaryTypeBO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetGeneralTypeDO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetSubsidiaryTypeDO;
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
}
