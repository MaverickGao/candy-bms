-- 体征指标记录表
drop table physical_data_index_record;
CREATE TABLE `physical_data_index_record` (
    `id` varchar(32) unique NOT NULL COMMENT '主键ID',
    `creator` varchar(32) DEFAULT NULL COMMENT '创建人',
    `create_time` varchar(14) DEFAULT NULL COMMENT '创建时间',
    `modifier` varchar(32) DEFAULT NULL COMMENT '修改人',
    `last_modify_time` varchar(14) DEFAULT NULL COMMENT '最后修改时间',
    `delete_flag` char(1) DEFAULT '0' COMMENT '生效状态；0-生效；1-失效',
    `record_date` varchar(10) NOT NULL COMMENT '记录日期',
    `record_type` char(1) DEFAULT '0' COMMENT '记录类型；0-记录；1-目标；2-标准',
    `height` decimal(5,2) NOT NULL COMMENT '身高（CM）',
    `weight` decimal(5,2) NOT NULL COMMENT '体重（KG）',
    `body_fat` decimal(5,2) NOT NULL COMMENT '体脂率（%）',
    `muscle_rate` decimal(5,2) NOT NULL COMMENT '肌肉率（%）',
    `visceral_fat_index` decimal(3,0) NOT NULL COMMENT '内脏脂肪指数',
    `bmr` decimal(6,2) NOT NULL COMMENT '基础代谢率（kcal）',
    `body_water` decimal(5,2) NOT NULL COMMENT '水分（%）',
    `protein` decimal(5,2) NOT NULL COMMENT '蛋白质（%）',
    `bone_mass` decimal(5,2) NOT NULL COMMENT '骨量（KG）',
    `muscle_resilience_level` decimal(5,2) NOT NULL COMMENT '储肌能力等级',
    `bmi` decimal(5,2) DEFAULT NULL COMMENT '身体质量指数',
    `physical_age` decimal(5,2) DEFAULT NULL COMMENT '身体年龄',
    `physical_type` char(1) DEFAULT NULL COMMENT '身体类型：0-偏瘦型；1-偏瘦肌肉型；2-肌肉发达型；3-缺乏锻炼型；4-标准型；5-标准肌肉型；6-隐胖型；7-偏胖型；8-肌肉型偏胖',
    PRIMARY KEY (`id`)
) COMMENT='体征指标记录表';

-- 体围指标记录表
drop table body_girth_data_index_record;
create table body_girth_data_index_record (
    `id` varchar(32) unique NOT NULL comment '主键ID',
    `creator` varchar(32) NULL comment '创建人',
    `create_time` varchar(14) NULL comment '创建时间',
    `modifier` varchar(32) NULL comment '修改人',
    `last_modify_time` varchar(14) NULL comment '最后修改时间',
    `delete_flag` char(1) NULL DEFAULT 0 comment '生效状态；0-生效；1-失效',
    `record_date` varchar(10) NOT NULL comment '记录日期',
    `record_type` char(1) NULL DEFAULT 0 comment '记录类型；0-记录；1-目标；2-标准',
    `waist` decimal(5,2) NULL comment '腰围（CM）',
    `upper_hips` decimal(5,2) NULL comment '上臀围（CM）',
    `hips` decimal(5,2) NULL comment '臀围（CM）',
    `shoulder_width` decimal(5,2) NULL comment '肩宽（CM）',
    `bust` decimal(5,2) NULL comment '胸围（CM）',
    `under_the_bust` decimal(5,2) NULL comment '下胸围（CM）',
    `left_upper_arm` decimal(5,2) NULL comment '左上臂围（CM）',
    `right_upper_arm` decimal(5,2) NULL comment '右上臂围（CM）',
    `left_thigh` decimal(5,2) NULL comment '左大腿围（CM）',
    `right_thigh` decimal(5,2) NULL comment '右大腿围（CM）',
    `left_calf` decimal(5,2) NULL comment '左小腿围（CM）',
    `right_calf` decimal(5,2) NULL comment '右小腿围（CM）',
    `waist_to_hip_ratio` decimal(5,2) NULL comment '腰臀比率',
    PRIMARY KEY(`id`)
) COMMENT = '体围指标记录表';
