package com.gzh.candy_bms.config;

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
    public void execute() throws Exception {
        log.info("bean class job-handler running...");
    }
}
