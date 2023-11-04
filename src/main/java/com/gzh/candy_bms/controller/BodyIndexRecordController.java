package com.gzh.candy_bms.controller;

import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.common.base.Result;
import com.gzh.candy_bms.pojo.request.InsertBalanceSheetRecordRequest;
import com.gzh.candy_bms.pojo.request.InsertBodyIndexRecordRequest;
import com.gzh.candy_bms.pojo.request.QueryBodyIndexRecordPageRequest;
import com.gzh.candy_bms.pojo.request.UpdateBodyIndexRecordRequest;
import com.gzh.candy_bms.pojo.response.BodyIndexRecordPageResponse;
import com.gzh.candy_bms.service.BodyIndexRecordService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 身体指标管理 控制层
 *
 * @author gaozhiheng
 */
@RestController
public class BodyIndexRecordController {

    @Resource
    private BodyIndexRecordService bodyIndexRecordService;

    /**
     * 查询 身体指标管理 分页列表
     *
     * @param request {@link QueryBodyIndexRecordPageRequest}
     * @return {@link PageResponse < BodyIndexRecordPageResponse >}
     */
    @PostMapping("/body-index-record/query-body-index-record-page")
    public Result<PageResponse<BodyIndexRecordPageResponse>> queryBodyIndexRecordPage(QueryBodyIndexRecordPageRequest request) {
        return Result.success(bodyIndexRecordService.queryBodyIndexRecordPage(request));
    }

    /**
     * 插入一条 身体指标管理 数据
     *
     * @param request {@link InsertBodyIndexRecordRequest}
     * @return 插入结果
     */
    @PostMapping("/body-index-record/insert-body-index-record-info")
    public Result<Void> insertBodyIndexRecordInfo(@RequestBody @Validated InsertBodyIndexRecordRequest request) {
        bodyIndexRecordService.insertBalanceSheetRecordInfo(request);
        return Result.success();
    }


    /**
     * 更新一条 身体指标管理 数据
     *
     * @param request {@link UpdateBodyIndexRecordRequest}
     * @return 插入结果
     */
    @PostMapping("/body-index-record/update-body-index-record-info")
    public Result<Void> updateBodyIndexRecordInfo(@RequestBody @Validated UpdateBodyIndexRecordRequest request) {
        bodyIndexRecordService.updateBodyIndexRecordInfo(request);
        return Result.success();
    }
}
