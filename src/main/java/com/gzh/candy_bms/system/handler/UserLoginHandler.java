package com.gzh.candy_bms.system.handler;

import com.gzh.candy_bms.common.base.exception.BusinessException;
import com.gzh.candy_bms.common.base.exception.ReturnCode;
import com.gzh.candy_bms.system.bean.bo.UserLoginBO;
import com.gzh.candy_bms.system.bean.model.BusUserDO;
import com.gzh.candy_bms.system.logic.BusUserLogic;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

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
        // 验证入参
        checkLoginParam(account);

        // 查询当前用户是否存在于生效系统用户内
        BusUserDO busUserDO = busUserLogic.queryNormalUserInfoByName(account);
        if (Objects.isNull(busUserDO)) {
            // todo 查看飞书用户信息是否存在，如果存在创建用户

            // 创建完成以后，重新查询用户信息
            busUserDO = busUserLogic.queryNormalUserInfoByName(account);
        }
        // 根据用户信息组装页面返回信息

        // 缓存用户信息

        return null;
    }

    private UserLoginBO buildUserLoginBO(BusUserDO busUserDO) {
        if (Objects.isNull(busUserDO)) {
            log.error("登录失败，未查询到用户信息！");
            throw new BusinessException(ReturnCode.LOGIN_NO_ACCOUNT_ERROR);
        }
        UserLoginBO result = new UserLoginBO();
        // 查询部门表信息
        return result;
    }

    /**
     * 验证登录入参
     *
     * @param account 当前登录账号
     */
    private void checkLoginParam(String account) {
        if (StringUtils.isBlank(account)) {
            log.error("登录失败，未输入登录账户名！");
            throw new BusinessException(ReturnCode.LOGIN_NO_ACCOUNT_ERROR);
        }
    }
}
