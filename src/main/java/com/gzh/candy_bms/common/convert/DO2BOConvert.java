package com.gzh.candy_bms.common.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * DO转BO
 *
 * @author gaozhiheng
 */
@Mapper(componentModel = "spring")
public interface DO2BOConvert {

    DO2BOConvert INSTANCE = Mappers.getMapper(DO2BOConvert.class);
}
