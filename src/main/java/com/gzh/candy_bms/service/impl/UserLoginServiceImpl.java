package com.gzh.candy_bms.service.impl;

import com.gzh.candy_bms.service.UserLoginService;
import com.gzh.candy_bms.system.handler.UserLoginHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统用户登录 Service 实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Resource
    private UserLoginHandler userLoginHandler;
}
