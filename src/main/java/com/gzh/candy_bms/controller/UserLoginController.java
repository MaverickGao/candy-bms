package com.gzh.candy_bms.controller;

import com.gzh.candy_bms.service.UserLoginService;
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
}
