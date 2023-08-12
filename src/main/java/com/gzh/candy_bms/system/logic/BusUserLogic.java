package com.gzh.candy_bms.system.logic;

import com.gzh.candy_bms.system.dao.BusUserDao;
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
}
