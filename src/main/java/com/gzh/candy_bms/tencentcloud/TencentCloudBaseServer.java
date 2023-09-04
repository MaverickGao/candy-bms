package com.gzh.candy_bms.tencentcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * 腾讯云基础服务
 *
 * @author gaozhiheng
 */
public abstract class TencentCloudBaseServer implements BaseServer {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    protected TencentCloudProperties properties;
}
