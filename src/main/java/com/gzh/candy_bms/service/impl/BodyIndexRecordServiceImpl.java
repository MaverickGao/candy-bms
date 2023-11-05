package com.gzh.candy_bms.service.impl;

import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.common.convert.Request2BOConvert;
import com.gzh.candy_bms.handler.BodyIndexRecordHandler;
import com.gzh.candy_bms.pojo.request.InsertBodyGirthIndexRecordRequest;
import com.gzh.candy_bms.pojo.request.InsertPhysicalIndexRecordRequest;
import com.gzh.candy_bms.pojo.request.QueryBodyIndexRecordPageRequest;
import com.gzh.candy_bms.pojo.request.UpdateBodyIndexRecordRequest;
import com.gzh.candy_bms.pojo.response.BodyIndexRecordPageResponse;
import com.gzh.candy_bms.service.BodyIndexRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 身体指标管理 Service 实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Service
public class BodyIndexRecordServiceImpl implements BodyIndexRecordService {

    @Resource
    private BodyIndexRecordHandler bodyIndexRecordHandler;

    @Resource
    private Request2BOConvert request2BOConvert;

    /**
     * 查询 身体指标管理 分页列表
     *
     * @param request 查询入参
     * @return 分页列表
     */
    @Override
    public PageResponse<BodyIndexRecordPageResponse> queryBodyIndexRecordPage(QueryBodyIndexRecordPageRequest request) {
        return null;
    }

    /**
     * 插入一条 体征指标管理 数据
     *
     * @param request {@link InsertPhysicalIndexRecordRequest}
     */
    @Override
    public void insertPhysicalIndexRecordInfo(InsertPhysicalIndexRecordRequest request) {
        bodyIndexRecordHandler.insertPhysicalIndexRecordInfo(
                request2BOConvert.insertPhysicalIndexRecordRequest2BO(request)
        );
    }

    /**
     * 插入一条 体围指标管理 数据
     *
     * @param request {@link InsertBodyGirthIndexRecordRequest}
     */
    @Override
    public void insertBodyGirthIndexRecordInfo(InsertBodyGirthIndexRecordRequest request) {
        bodyIndexRecordHandler.insertBodyGirthIndexRecordInfo(
                request2BOConvert.insertBodyGirthIndexRecordRequest2BO(request)
        );
    }

    /**
     * 更新一条 身体指标管理 数据
     *
     * @param request {@link UpdateBodyIndexRecordRequest}
     */
    @Override
    public void updateBodyIndexRecordInfo(UpdateBodyIndexRecordRequest request) {

    }
}
