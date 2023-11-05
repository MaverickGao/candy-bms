package com.gzh.candy_bms.service;

import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.pojo.request.InsertBodyGirthIndexRecordRequest;
import com.gzh.candy_bms.pojo.request.InsertPhysicalIndexRecordRequest;
import com.gzh.candy_bms.pojo.request.QueryBodyIndexRecordPageRequest;
import com.gzh.candy_bms.pojo.request.UpdateBodyIndexRecordRequest;
import com.gzh.candy_bms.pojo.response.BodyIndexRecordPageResponse;

/**
 * 身体指标管理 Service 接口
 *
 * @author gaozhiheng
 */
public interface BodyIndexRecordService {

    /**
     * 查询 身体指标管理 分页列表
     *
     * @param request 查询入参
     * @return 分页列表
     */
    PageResponse<BodyIndexRecordPageResponse> queryBodyIndexRecordPage(QueryBodyIndexRecordPageRequest request);

    /**
     * 插入一条 体征指标管理 数据
     *
     * @param request {@link InsertPhysicalIndexRecordRequest}
     */
    void insertPhysicalIndexRecordInfo(InsertPhysicalIndexRecordRequest request);

    /**
     * 插入一条 体围指标管理 数据
     *
     * @param request {@link InsertBodyGirthIndexRecordRequest}
     */
    void insertBodyGirthIndexRecordInfo(InsertBodyGirthIndexRecordRequest request);

    /**
     * 更新一条 身体指标管理 数据
     *
     * @param request {@link UpdateBodyIndexRecordRequest}
     */
    void updateBodyIndexRecordInfo(UpdateBodyIndexRecordRequest request);
}
