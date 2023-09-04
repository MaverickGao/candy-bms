package com.gzh.candy_bms.tencentcloud.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 腾讯云 云点播 上传状态枚举类
 *
 * @author gaozhiheng
 */
@Getter
@AllArgsConstructor
public enum TencentUploadStatus {
    UPLOAD_FAIL("2", "上传失败"),
    UPLOAD_SUCCESS("1", "上传成功"),
    UPLOAD("0", "上传中");

    /**
     * 枚举值
     */
    private final String code;

    /**
     * 枚举内容
     */
    private final String desc;
}
