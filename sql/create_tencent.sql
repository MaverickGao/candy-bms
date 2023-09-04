-- 腾讯云点播上传历史表
drop table tencent_video_storage_history;
create table tencent_video_storage_history (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `file_name` varchar(20) NOT NULL comment '文件名称',
    `tencent_file_id` varchar(20) NULL comment '腾讯云文件ID',
    `media_url` varchar(500) NULL comment '视频url',
    `upload_status` char(1) NOT NULL comment '上传状态；0-上传中；1-上传成功；2-上传失败'
);

