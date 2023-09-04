package com.gzh.candy_bms.tencentcloud.bean.bo;

import lombok.Data;
import lombok.ToString;

/**
 * 本地文件临时存储 BO
 *
 * @author gaozhiheng
 */
@Data
@ToString
public class StorageBO {

    /**
     * 文件原名
     */
    private String fileName;

    /**
     * 文件路径
     */
    private String filePath;
}
