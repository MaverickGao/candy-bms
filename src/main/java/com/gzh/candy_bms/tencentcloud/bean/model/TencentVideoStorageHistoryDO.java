package com.gzh.candy_bms.tencentcloud.bean.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gzh.candy_bms.common.base.BaseModel;
import lombok.*;

import java.io.Serializable;

/**
 * 腾讯云点播上传历史表
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("tencent_video_storage_history")
public class TencentVideoStorageHistoryDO extends BaseModel implements Serializable {

    private static final long serialVersionUID = 2397064718101970287L;

    /**
     * 文件名称
     */
    @TableField("file_name")
    private String fileName;

    /**
     * 腾讯云文件ID
     */
    @TableField("tencent_file_id")
    private String tencentFileId;

    /**
     * 视频url
     */
    @TableField("media_url")
    private String mediaUrl;

    /**
     * 上传状态；0-上传中；1-上传成功；2-上传失败
     */
    @TableField("upload_status")
    private String uploadStatus;
}
