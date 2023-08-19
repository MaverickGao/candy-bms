package com.gzh.candy_bms.system.logic;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gzh.candy_bms.common.enums.DeleteFlagEnum;
import com.gzh.candy_bms.common.enums.UserStatusEnum;
import com.gzh.candy_bms.system.bean.model.BusUserDO;
import com.gzh.candy_bms.system.dao.BusUserDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 系统用户 Logic
 *
 * @author gaozhiheng
 */
@Component
public class BusUserLogic {

    @Resource
    private BusUserDao busUserDao;

    /**
     * 根据 用户名称 查询生效用户信息
     *
     * @param userName 用户名称
     * @return 生效用户信息
     */
    public BusUserDO queryNormalUserInfoByName(String userName) {
        if (StringUtils.isBlank(userName)) {
            return null;
        }
        return busUserDao.getOne(
                Wrappers.<BusUserDO>lambdaQuery()
                        .eq(BusUserDO::getUserName, userName)
                        .eq(BusUserDO::getStatus, UserStatusEnum.USER_NORMAL.getCode())
                        .eq(BusUserDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .last("limit 1")
        );
    }
}
