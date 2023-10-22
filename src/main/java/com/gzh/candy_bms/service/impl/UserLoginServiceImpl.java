package com.gzh.candy_bms.service.impl;

import com.gzh.candy_bms.common.convert.BO2ResponseConvert;
import com.gzh.candy_bms.pojo.response.UserLoginResponse;
import com.gzh.candy_bms.service.UserLoginService;
import com.gzh.candy_bms.handler.UserLoginHandler;
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

    @Resource
    private BO2ResponseConvert bo2ResponseConvert;

    /**
     * 账号登录
     *
     * @param account 当前登录账号
     * @return 当前账号信息
     */
    @Override
    public UserLoginResponse login(String account) {
        return bo2ResponseConvert.UserLoginBO2Response(
                userLoginHandler.login(account)
        );
    }
}
