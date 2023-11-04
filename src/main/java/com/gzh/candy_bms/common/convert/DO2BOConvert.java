package com.gzh.candy_bms.common.convert;

import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.record.bean.bo.QueryBalanceSheetRecordPageBO;
import com.gzh.candy_bms.record.bean.bo.QueryGeneralTypeBO;
import com.gzh.candy_bms.record.bean.bo.QuerySubsidiaryTypeBO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetGeneralTypeDO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetRecordDO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetSubsidiaryTypeDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * DO转BO
 *
 * @author gaozhiheng
 */
@Mapper(componentModel = "spring")
public interface DO2BOConvert {

    DO2BOConvert INSTANCE = Mappers.getMapper(DO2BOConvert.class);

    /**
     * BalanceSheetGeneralTypeDO 2 QueryGeneralTypeBO
     *
     * @param balanceSheetGeneralTypeDO {@link BalanceSheetGeneralTypeDO}
     * @return {@link QueryGeneralTypeBO}
     */
    @Mapping(target = "generalTypeId", source = "id")
    @Mapping(target = "generalTypeName", source = "typeName")
    QueryGeneralTypeBO balanceSheetGeneralTypeDO2QueryGeneralTypeBO(BalanceSheetGeneralTypeDO balanceSheetGeneralTypeDO);


    /**
     * BalanceSheetGeneralTypeDO 2 QueryGeneralTypeBO List
     *
     * @param list {@link List<BalanceSheetGeneralTypeDO> }
     * @return {@link List<QueryGeneralTypeBO>}
     */
    List<QueryGeneralTypeBO> balanceSheetGeneralTypeDO2QueryGeneralTypeBOList(List<BalanceSheetGeneralTypeDO> list);

    /**
     * BalanceSheetSubsidiaryTypeDO 2 QuerySubsidiaryTypeBO
     *
     * @param balanceSheetSubsidiaryTypeDO {@link BalanceSheetSubsidiaryTypeDO}
     * @return {@link QuerySubsidiaryTypeBO}
     */
    @Mapping(target = "generalTypeId", source = "generalTypeId")
    @Mapping(target = "subsidiaryTypeId", source = "id")
    @Mapping(target = "subsidiaryTypeName", source = "typeName")
    QuerySubsidiaryTypeBO balanceSheetSubsidiaryTypeDO2QuerySubsidiaryTypeBO(BalanceSheetSubsidiaryTypeDO balanceSheetSubsidiaryTypeDO);

    /**
     * BalanceSheetSubsidiaryTypeDO 2 QuerySubsidiaryTypeBO List
     *
     * @param list {@link List<BalanceSheetSubsidiaryTypeDO>}
     * @return {@link List<QuerySubsidiaryTypeBO>}
     */
    List<QuerySubsidiaryTypeBO> balanceSheetSubsidiaryTypeDO2QuerySubsidiaryTypeBOList(List<BalanceSheetSubsidiaryTypeDO> list);

    /**
     * BalanceSheetRecord DO 2 pageBO
     *
     * @param balanceSheetRecordDO {@link BalanceSheetRecordDO}
     * @return {@link QueryBalanceSheetRecordPageBO}
     */
    QueryBalanceSheetRecordPageBO balanceSheetRecordDO2PageBO(BalanceSheetRecordDO balanceSheetRecordDO);

    /**
     * BalanceSheetRecord DO 2 pageBO Page
     *
     * @param page {@link PageResponse<BalanceSheetRecordDO>}
     * @return {@link PageResponse<QueryBalanceSheetRecordPageBO>}
     */
    PageResponse<QueryBalanceSheetRecordPageBO> balanceSheetRecordDO2PageBOPage(PageResponse<BalanceSheetRecordDO> page);
}
