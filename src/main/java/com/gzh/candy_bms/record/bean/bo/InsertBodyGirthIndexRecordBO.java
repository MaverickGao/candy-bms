package com.gzh.candy_bms.record.bean.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 体围指标管理新增 BO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class InsertBodyGirthIndexRecordBO {

    /**
     * 记录日期
     */
    private String recordDate;

    /**
     * 记录类型；0-记录；1-目标；2-标准
     */
    private String recordType;

    /**
     * 腰围（CM）
     */
    private BigDecimal waist;

    /**
     * 上臀围（CM）
     */
    private BigDecimal upperHips;

    /**
     * 臀围（CM）
     */
    private BigDecimal hips;

    /**
     * 肩宽（CM）
     */
    private BigDecimal shoulderWidth;

    /**
     * 胸围（CM）
     */
    private BigDecimal bust;

    /**
     * 下胸围（CM）
     */
    private BigDecimal underTheBust;

    /**
     * 左上臂围（CM）
     */
    private BigDecimal leftUpperArm;

    /**
     * 右上臂围（CM）
     */
    private BigDecimal rightUpperArm;

    /**
     * 左大腿围（CM）
     */
    private BigDecimal leftThigh;

    /**
     * 右大腿围（CM）
     */
    private BigDecimal rightThigh;

    /**
     * 左小腿围（CM）
     */
    private BigDecimal leftCalf;

    /**
     * 右小腿围（CM）
     */
    private BigDecimal rightCalf;

    /**
     * 腰臀比率
     */
    private BigDecimal waistToHipRatio;
}
