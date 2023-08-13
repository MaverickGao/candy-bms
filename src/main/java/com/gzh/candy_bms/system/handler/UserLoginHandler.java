package com.gzh.candy_bms.system.handler;

import com.gzh.candy_bms.system.bean.bo.UserLoginBO;
import com.gzh.candy_bms.system.logic.BusUserLogic;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 系统用户登录Handler
 *
 * @author gaozhiheng
 */
@Slf4j
@Component
public class UserLoginHandler {

    @Resource
    private BusUserLogic busUserLogic;

    /**
     * 登录
     *
     * @param account 当前登录账号
     * @return 登录信息
     */
    public UserLoginBO login(String account) {
        return null;
    }
}
