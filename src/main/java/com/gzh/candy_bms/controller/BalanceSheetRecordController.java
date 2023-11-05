package com.gzh.candy_bms.controller;

import com.gzh.candy_bms.common.base.PageResponse;
import com.gzh.candy_bms.common.base.Result;
import com.gzh.candy_bms.pojo.request.CommonDeleteFlagRequest;
import com.gzh.candy_bms.pojo.request.InsertBalanceSheetRecordRequest;
import com.gzh.candy_bms.pojo.request.QueryBalanceSheetRecordPageRequest;
import com.gzh.candy_bms.pojo.response.QueryBalanceSheetRecordPageResponse;
import com.gzh.candy_bms.service.BalanceSheetRecordService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 收支记录 控制层
 *
 * @author gaozhiheng
 */
@RestController
public class BalanceSheetRecordController {

    @Resource
    private BalanceSheetRecordService balanceSheetRecordService;

    /**
     * 插入一条 收支记录 数据
     *
     * @param request {@link InsertBalanceSheetRecordRequest}
     * @return 插入结果
     */
    @PostMapping("/balance-sheet/general-type/insert-balance-sheet-record-info")
    public Result<Void> insertBalanceSheetRecordInfo(@RequestBody @Validated InsertBalanceSheetRecordRequest request) {
        balanceSheetRecordService.insertBalanceSheetRecordInfo(request);
        return Result.success();
    }

    /**
     * 查询 收支记录 分页列表
     *
     * @param request {@link QueryBalanceSheetRecordPageRequest}
     * @return {@link PageResponse<QueryBalanceSheetRecordPageResponse>}
     */
    @PostMapping("/balance-sheet/general-type/query-balance-sheet-record-page")
    public Result<PageResponse<QueryBalanceSheetRecordPageResponse>> queryBalanceSheetRecordPage(QueryBalanceSheetRecordPageRequest request) {
        return Result.success(balanceSheetRecordService.queryBalanceSheetRecordPage(request));
    }

    /**
     * 删除一条 收支记录 数据
     *
     * @param request {@link CommonDeleteFlagRequest}
     * @return 删除结果
     */
    @PostMapping("/balance-sheet/general-type/delete-balance-sheet-record-info")
    public Result<Void> deleteBalanceSheetRecordInfo(@RequestBody @Validated CommonDeleteFlagRequest request) {
        balanceSheetRecordService.deleteBalanceSheetRecordInfo(request.getId());
        return Result.success();
    }
}
