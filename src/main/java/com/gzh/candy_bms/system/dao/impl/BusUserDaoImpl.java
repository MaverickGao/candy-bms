package com.gzh.candy_bms.system.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gzh.candy_bms.system.bean.model.BusUserDO;
import com.gzh.candy_bms.system.dao.BusUserDao;
import com.gzh.candy_bms.system.mapper.BusUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * 系统用户 Dao实现类
 *
 * @author gaozhiheng
 */
@Slf4j
@Repository
public class BusUserDaoImpl extends ServiceImpl<BusUserMapper, BusUserDO> implements BusUserDao {
}
