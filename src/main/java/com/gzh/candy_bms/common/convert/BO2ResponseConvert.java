package com.gzh.candy_bms.common.convert;

import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.pojo.response.QueryBalanceSheetRecordPageResponse;
import com.gzh.candy_bms.pojo.response.QueryGeneralTypeResponse;
import com.gzh.candy_bms.pojo.response.QuerySubsidiaryTypeResponse;
import com.gzh.candy_bms.pojo.response.UserLoginResponse;
import com.gzh.candy_bms.record.bean.bo.QueryBalanceSheetRecordPageBO;
import com.gzh.candy_bms.record.bean.bo.QueryGeneralTypeBO;
import com.gzh.candy_bms.record.bean.bo.QuerySubsidiaryTypeBO;
import com.gzh.candy_bms.system.bean.bo.UserLoginBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * BO转Response
 *
 * @author gaozhiheng
 */
@Mapper(componentModel = "spring")
public interface BO2ResponseConvert {

    BO2ResponseConvert INSTANCE = Mappers.getMapper(BO2ResponseConvert.class);

    /**
     * UserLogin BO 2 Response
     *
     * @param userLoginBO {@link UserLoginBO}
     * @return {@link UserLoginResponse}
     */
    UserLoginResponse userLoginBO2Response(UserLoginBO userLoginBO);

    /**
     * QueryGeneralType BO 2 Response
     *
     * @param queryGeneralTypeBO {@link QueryGeneralTypeBO}
     * @return {@link QueryGeneralTypeResponse}
     */
    QueryGeneralTypeResponse queryGeneralTypeBO2Response(QueryGeneralTypeBO queryGeneralTypeBO);

    /**
     * QueryGeneralType BO 2 Response List
     *
     * @param list {@link List<QueryGeneralTypeBO>}
     * @return {@link List<QueryGeneralTypeResponse>}
     */
    List<QueryGeneralTypeResponse> queryGeneralTypeBO2ResponseList(List<QueryGeneralTypeBO> list);

    /**
     * QuerySubsidiaryType BO 2 Response
     *
     * @param querySubsidiaryTypeBO {@link QuerySubsidiaryTypeBO}
     * @return {@link QuerySubsidiaryTypeResponse}
     */
    QuerySubsidiaryTypeResponse querySubsidiaryTypeBO2Response(QuerySubsidiaryTypeBO querySubsidiaryTypeBO);

    /**
     * QuerySubsidiaryType BO 2 Response List
     *
     * @param list {@link List<QuerySubsidiaryTypeBO>}
     * @return {@link List<QuerySubsidiaryTypeResponse>}
     */
    List<QuerySubsidiaryTypeResponse> querySubsidiaryTypeBO2ResponseList(List<QuerySubsidiaryTypeBO> list);

    /**
     * QueryBalanceSheetRecordPage BO 2 Response
     *
     * @param queryBalanceSheetRecordPageBO {@link QueryBalanceSheetRecordPageBO}
     * @return {@link QueryBalanceSheetRecordPageResponse}
     */
    QueryBalanceSheetRecordPageResponse queryBalanceSheetRecordPageBO2Response(QueryBalanceSheetRecordPageBO queryBalanceSheetRecordPageBO);

    /**
     * QueryBalanceSheetRecordPage BO 2 Response Page
     *
     * @param pageResponse {@link PageResponse<QueryBalanceSheetRecordPageBO>}
     * @return {@link PageResponse<QueryBalanceSheetRecordPageResponse>}
     */
    PageResponse<QueryBalanceSheetRecordPageResponse> queryBalanceSheetRecordPageBO2ResponsePage(PageResponse<QueryBalanceSheetRecordPageBO> pageResponse);
}
