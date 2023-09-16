package com.gzh.candy_bms.feishu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * 飞书SDK 基础抽象类
 *
 * @author gaozhiheng
 */
public abstract class BaseAbstractServer implements BaseServer {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    protected FeishuProperties properties;
}
