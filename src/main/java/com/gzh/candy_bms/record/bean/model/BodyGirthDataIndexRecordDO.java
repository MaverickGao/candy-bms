package com.gzh.candy_bms.record.bean.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gzh.candy_bms.common.base.BaseModel;
import lombok.*;

import java.io.Serializable;

/**
 * 体围指标记录表 DO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("body_girth_data_index_record")
public class BodyGirthDataIndexRecordDO extends BaseModel implements Serializable {
    
    private static final long serialVersionUID = 4843667210708172452L;

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
     * 腰围（CM）
     */
    @TableField("waist")
    private String waist;

    /**
     * 上臀围（CM）
     */
    @TableField("upper_hips")
    private String upperHips;

    /**
     * 臀围（CM）
     */
    @TableField("hips")
    private String hips;

    /**
     * 肩宽（CM）
     */
    @TableField("shoulder_width")
    private String shoulderWidth;

    /**
     * 胸围（CM）
     */
    @TableField("bust")
    private String bust;

    /**
     * 下胸围（CM）
     */
    @TableField("under_the_bust")
    private String underTheBust;

    /**
     * 左上臂围（CM）
     */
    @TableField("left_upper_arm")
    private String leftUpperArm;

    /**
     * 右上臂围（CM）
     */
    @TableField("right_upper_arm")
    private String rightUpperArm;

    /**
     * 左大腿围（CM）
     */
    @TableField("left_thigh")
    private String leftThigh;
    /**
     * 右大腿围（CM）
     */
    @TableField("right_thigh")
    private String rightThigh;
    /**
     * 左小腿围（CM）
     */
    @TableField("left_calf")
    private String leftCalf;
    /**
     * 右小腿围（CM）
     */
    @TableField("right_calf")
    private String rightCalf;

    /**
     * 腰臀比率
     */
    @TableField("waist_to_hip_ratio")
    private String waistToHipRatio;
}
