-- 收支总类别
drop table balance_sheet_general_type;
create table balance_sheet_general_type (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `type_name` varchar(20) NOT NULL comment '总类别名称',
    `balance_type` char(1) NULL DEFAULT 0 comment '收支标志；0-收入；1-支出',
    `general_type_describe` varchar(100) NULL comment '总类别描述',
    PRIMARY KEY(`id`)
) COMMENT = '收支总类别';

-- 收支明细类别
drop table balance_sheet_subsidiary_type;
create table balance_sheet_subsidiary_type (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `general_type_id` varchar(32) NOT NULL comment '总类别名称',
    `type_name` varchar(20) NOT NULL comment '明细类别名称',
    `balance_type` char(1) NULL DEFAULT 0 comment '收支标志；0-收入；1-支出',
    `subsidiary_type_describe` varchar(100) NULL comment '明细类别描述',
    PRIMARY KEY(`id`)
) COMMENT = '收支明细类别';

-- 收支记录表
drop table balance_sheet_record;
create table balance_sheet_record (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `record_date` varchar(10) NOT NULL comment '记录日期',
    `balance_type` char(1) NULL DEFAULT 0 comment '收支标志；0-收入；1-支出',
    `subsidiary_balance_type` char(1) NULL DEFAULT 0 comment '收支细分标志；0-固定收入；1-额外收入；2-固定支出；3-额外支出',
    `subsidiary_type_id` varchar(32) NULL comment '收支细分类别ID',
    `general_type_id` varchar(32) NULL comment '收支总类别ID',
    `balance_describe` varchar(100) NULL comment '收支描述',
    `expenses_evaluation` char(1) NULL DEFAULT 0 comment '支出评价；0-好支出；1-坏支出；2-必须支出',
    `bad_expenses_reason` varchar(100) NULL comment '坏支出原因',
    PRIMARY KEY(`id`)
) COMMENT = '收支记录表';