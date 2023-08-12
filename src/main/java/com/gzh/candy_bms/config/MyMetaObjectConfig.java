package com.gzh.candy_bms.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * MyMetaObject 配置类
 *
 * @author gaozhiheng
 */
@Slf4j
@Component
public class MyMetaObjectConfig implements MetaObjectHandler {

    private static final String DATE_TIME_TO_STRING = "yyyyMMddHHmmss";
    private static final String SYSTEM = "system";
    private static final String NO_CHAR = "0";


    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createTime", String.class, LocalDateTime.now().format(
                DateTimeFormatter.ofPattern(DATE_TIME_TO_STRING)));
        this.strictInsertFill(metaObject, "lastModifyTime", String.class, LocalDateTime.now().format(
                DateTimeFormatter.ofPattern(DATE_TIME_TO_STRING)));
        this.strictInsertFill(metaObject, "creator", String.class, SYSTEM);
        this.strictInsertFill(metaObject, "modifier", String.class, SYSTEM);
        this.strictInsertFill(metaObject, "deleteFlag", String.class, NO_CHAR);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "lastModifyTime", String.class, LocalDateTime.now().format(
                DateTimeFormatter.ofPattern(DATE_TIME_TO_STRING)));
    }
}
