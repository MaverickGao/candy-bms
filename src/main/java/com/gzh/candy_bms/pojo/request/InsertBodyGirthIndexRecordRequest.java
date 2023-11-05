package com.gzh.candy_bms.pojo.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 体围指标管理新增 Request
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class InsertBodyGirthIndexRecordRequest implements Serializable {

    private static final long serialVersionUID = 1843471106186078009L;
    /**
     * 记录日期
     */
    @NotNull(message = "请输入记录日期")
    private String recordDate;

    /**
     * 记录类型；0-记录；1-目标；2-标准
     */
    @NotNull(message = "请输入记录类型")
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
