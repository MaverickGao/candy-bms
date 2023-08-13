package com.gzh.candy_bms.service;

import com.gzh.candy_bms.pojo.response.UserLoginResponse;

/**
 * 系统用户登录 Service
 *
 * @author gaozhiheng
 */
public interface UserLoginService {

    /**
     * 登录
     *
     * @param account 当前登录账号
     * @return 账号登录信息
     */
    UserLoginResponse login(String account);
}
