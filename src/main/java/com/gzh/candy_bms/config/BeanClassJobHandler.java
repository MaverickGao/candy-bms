package com.gzh.candy_bms.config;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * xxl-job Handler
 *
 * @author gaozhiheng
 */
@Slf4j
@Component
public class BeanClassJobHandler extends IJobHandler {

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        log.info("bean class job-handler running...");
        return SUCCESS;
    }
}
