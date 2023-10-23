package com.gzh.candy_bms.common.convert;

import com.gzh.candy_bms.record.bean.bo.QueryGeneralTypeBO;
import com.gzh.candy_bms.record.bean.model.BalanceSheetGeneralTypeDO;
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
    QueryGeneralTypeBO balanceSheetGeneralTypeDOQueryGeneralTypeBO(BalanceSheetGeneralTypeDO balanceSheetGeneralTypeDO);


    /**
     * BalanceSheetGeneralTypeDO 2 QueryGeneralTypeBO List
     *
     * @param list {@link List<BalanceSheetGeneralTypeDO> }
     * @return {@link List<QueryGeneralTypeBO>}
     */
    List<QueryGeneralTypeBO> balanceSheetGeneralTypeDOQueryGeneralTypeBOList(List<BalanceSheetGeneralTypeDO> list);
}
