package com.gzh.candy_bms.record.bean.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gzh.candy_bms.common.base.BaseModel;
import lombok.*;

import java.io.Serializable;

/**
 * 体征指标记录表 DO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("physical_data_index_record")
public class PhysicalDataIndexRecordDO extends BaseModel implements Serializable {
    
    private static final long serialVersionUID = 8329089383979926422L;

    /**
     * 记录日期
     */
    @TableField("record_date")
    private String recordDate;
    
    /**
     * 记录类型；0-记录；1-目标；2-标准
     */
    @TableField("record_type")
    private String recordType;
    
    /**
     * 身高（CM）
     */
    @TableField("height")
    private String height;
    
    /**
     * 体重（KG）
     */
    @TableField("weight")
    private String weight;

    /**
     * 体脂率（%）
     */
    @TableField("body_fat")
    private String bodyFat;

    /**
     * 肌肉率（%）
     */
    @TableField("muscle_rate")
    private String muscleRate;

    /**
     * 内脏脂肪指数
     */
    @TableField("visceral_fat_index")
    private String visceralFatIndex;

    /**
     * 基础代谢率（kcal）
     */
    @TableField("bmr")
    private String bmr;

    /**
     * 水分（%）
     */
    @TableField("body_water")
    private String bodyWater;

    /**
     * 蛋白质（%）
     */
    @TableField("protein")
    private String protein;

    /**
     * 骨量（KG）
     */
    @TableField("bone_mass")
    private String boneMass;

    /**
     * 储肌能力等级
     */
    @TableField("muscle_resilience_level")
    private String muscleResilienceLevel;

    /**
     * 身体质量指数
     */
    @TableField("bmi")
    private String bmi;

    /**
     * 身体年龄
     */
    @TableField("physical_age")
    private String physicalAge;

    /**
     * 身体类型：
     * 0-偏瘦型；1-偏瘦肌肉型；2-肌肉发达型；3-缺乏锻炼型；
     * 4-标准型；5-标准肌肉型；6-隐胖型；7-偏胖型；8-肌肉型偏胖
     */
    @TableField("physical_type")
    private String physicalType;
}
