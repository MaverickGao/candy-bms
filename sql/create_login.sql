-- 用户表
drop table bus_user;
create table bus_user (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `user_name` varchar(20) NOT NULL comment '用户名',
    `mobile` varchar(11) NULL comment '用户电话',
    `email` varchar(100) NULL comment '用户Email',
    `role_id` varchar(32) null comment '角色ID',
    `dept_id` varchar(32) null comment '部门ID',
    `user_code` varchar(32) null comment '用户Code',
    `status` char(1) NOT NULL comment '用户状态；0-生效；1-冻结；2-注销'
);
