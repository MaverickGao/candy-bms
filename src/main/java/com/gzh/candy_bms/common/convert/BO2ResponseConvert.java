package com.gzh.candy_bms.common.convert;

import com.gzh.candy_bms.pojo.response.UserLoginResponse;
import com.gzh.candy_bms.system.bean.bo.UserLoginBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * BO转Response
 *
 * @author gaozhiheng
 */
@Mapper
public interface BO2ResponseConvert {

    BO2ResponseConvert INSTANCE = Mappers.getMapper(BO2ResponseConvert.class);

    /**
     * UserLogin BO 2 Response
     *
     * @param userLoginBO {@link UserLoginBO}
     * @return {@link UserLoginResponse}
     */
    UserLoginResponse UserLoginBO2Response(UserLoginBO userLoginBO);

}
