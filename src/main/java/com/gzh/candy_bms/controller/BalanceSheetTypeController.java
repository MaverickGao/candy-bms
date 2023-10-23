package com.gzh.candy_bms.controller;

import com.gzh.candy_bms.common.base.Result;
import com.gzh.candy_bms.pojo.request.InsertGeneralTypeRequest;
import com.gzh.candy_bms.pojo.request.QueryGeneralTypeRequest;
import com.gzh.candy_bms.pojo.response.QueryGeneralTypeResponse;
import com.gzh.candy_bms.service.BalanceSheetTypeService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 收支类型管理 控制层
 *
 * @author gaozhiheng
 */
@RestController
public class BalanceSheetTypeController {

    @Resource
    private BalanceSheetTypeService balanceSheetTypeService;

    /**
     * 新增加一条 收支总类别 数据
     *
     * @param request {@link InsertGeneralTypeRequest}
     * @return 新增结果
     */
    @PostMapping("/balance-sheet/general-type/insert-general-type-info")
    public Result<Void> insertGeneralTypeInfo(@RequestBody @Validated InsertGeneralTypeRequest request) {
        balanceSheetTypeService.insertGeneralTypeInfo(request);
        return Result.success();
    }

    /**
     * 根据 收支总类别名称 查询 收支总类别列表
     *
     * @param request {@link QueryGeneralTypeRequest}
     * @return {@link List<QueryGeneralTypeResponse>}
     */
    @PostMapping("/balance-sheet/general-type/query-general-type-list")
    public Result<List<QueryGeneralTypeResponse>> queryGeneralTypeList(@RequestBody @Validated QueryGeneralTypeRequest request) {
        return Result.success(balanceSheetTypeService.queryGeneralTypeList(request.getGeneralTypeName(), request.getBalanceType()));
    }
}
