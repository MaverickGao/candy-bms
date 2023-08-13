package com.gzh.candy_bms.controller;

import com.gzh.candy_bms.common.base.Result;
import com.gzh.candy_bms.pojo.request.UserLoginRequest;
import com.gzh.candy_bms.pojo.response.UserLoginResponse;
import com.gzh.candy_bms.service.UserLoginService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 登录接口
 *
 * @author gaozhiheng
 */
@RestController
public class UserLoginController {

    @Resource
    private UserLoginService userLoginService;

    /**
     * 登录接口
     *
     * @param request {@link UserLoginRequest}
     * @return {@link UserLoginResponse}
     */
    @PostMapping("/login")
    public Result<UserLoginResponse> login(@Validated @RequestBody UserLoginRequest request) {
        return Result.success(userLoginService.login(request.getAccount()));
    }
}
