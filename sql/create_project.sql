-- 计划模块建表语句
drop table bus_plan_info;
create table bus_plan_info (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `plan_name` varchar(50) NOT NULL comment '计划名称',
    `start_date` varchar(8) NULL comment '计划开始日期：yyyyMMdd',
    `end_date` varchar(8) NULL comment '计划截至日期：yyyyMMdd',
    `plan_describe` varchar(100) NULL comment '计划描述',
    `priority` char(1) NULL comment '计划优先级：0-重要且紧急；1-重要不紧急；2-不重要紧急；3-不重要不紧急',
    `plan_type` varchar(32) NULL comment '计划类别',
    `plan_status` char(1) NULL DEFAULT 0 comment '计划状态；0-未完成；1-已完成',
    PRIMARY KEY(`id`)
) COMMENT = '计划信息表';

-- 计划类别建表语句
drop table bus_plan_type;
create table bus_plan_type (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `plan_type_name` varchar(10) NOT NULL comment '计划类别名称',
    `plan_type_icon` varchar(100) NULL comment '计划类别图标',
    `sort` varchar(4) DEFAULT '0' comment '排序',
    PRIMARY KEY(`id`)
) COMMENT = '计划类别表';

-- 子计划模块建表语句
drop table bus_sub_plan_info;
create table bus_sub_plan_info (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `plan_id` varchar(32) NOT NULL comment '父计划ID',
    `sub_plan_name` varchar(50) NOT NULL comment '子计划名称',
    `start_date` varchar(8) NULL comment '子计划开始日期：yyyyMMdd',
    `end_date` varchar(8) NULL comment '子计划截至日期：yyyyMMdd',
    `plan_describe` varchar(100) NULL comment '计划描述',
    `plan_type` varchar(32) NULL comment '计划类别',
    `plan_status` char(1) NULL DEFAULT 0 comment '计划状态；0-未完成；1-已完成',
    PRIMARY KEY(`id`)
) COMMENT = '子计划信息表';

-- 任务模块建表语句
drop table bus_task_info;
create table bus_task_info (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `sub_plan_id` varchar(32) NOT NULL comment '子计划ID',
    `task_name` varchar(50) NOT NULL comment '任务名称',
    `priority` char(1) NULL comment '计划优先级：0-重要且紧急；1-重要不紧急；2-不重要紧急；3-不重要不紧急',
    `task_status` char(1) NULL DEFAULT 0 comment '任务状态；0-未完成；1-已完成',
    `task_describe` varchar(100) NULL comment '任务描述',
    PRIMARY KEY(`id`)
) COMMENT = '任务信息表';