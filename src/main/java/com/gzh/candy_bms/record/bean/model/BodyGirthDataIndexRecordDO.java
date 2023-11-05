package com.gzh.candy_bms.record.bean.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.gzh.candy_bms.common.base.BaseModel;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

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
    private BigDecimal waist;

    /**
     * 上臀围（CM）
     */
    @TableField("upper_hips")
    private BigDecimal upperHips;

    /**
     * 臀围（CM）
     */
    @TableField("hips")
    private BigDecimal hips;

    /**
     * 肩宽（CM）
     */
    @TableField("shoulder_width")
    private BigDecimal shoulderWidth;

    /**
     * 胸围（CM）
     */
    @TableField("bust")
    private BigDecimal bust;

    /**
     * 下胸围（CM）
     */
    @TableField("under_the_bust")
    private BigDecimal underTheBust;

    /**
     * 左上臂围（CM）
     */
    @TableField("left_upper_arm")
    private BigDecimal leftUpperArm;

    /**
     * 右上臂围（CM）
     */
    @TableField("right_upper_arm")
    private BigDecimal rightUpperArm;

    /**
     * 左大腿围（CM）
     */
    @TableField("left_thigh")
    private BigDecimal leftThigh;

    /**
     * 右大腿围（CM）
     */
    @TableField("right_thigh")
    private BigDecimal rightThigh;

    /**
     * 左小腿围（CM）
     */
    @TableField("left_calf")
    private BigDecimal leftCalf;

    /**
     * 右小腿围（CM）
     */
    @TableField("right_calf")
    private BigDecimal rightCalf;

    /**
     * 腰臀比率
     */
    @TableField("waist_to_hip_ratio")
    private BigDecimal waistToHipRatio;
}
