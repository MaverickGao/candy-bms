package com.gzh.candy_bms.record.bean.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 体征指标管理新增 BO
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class InsertPhysicalIndexRecordBO {

    /**
     * 记录日期
     */
    private String recordDate;

    /**
     * 记录类型；0-记录；1-目标；2-标准
     */
    private String recordType;

    /**
     * 身高（CM）
     */
    private BigDecimal height;

    /**
     * 体重（KG）
     */
    private BigDecimal weight;

    /**
     * 体脂率（%）
     */
    private BigDecimal bodyFat;

    /**
     * 肌肉率（%）
     */
    private BigDecimal muscleRate;

    /**
     * 内脏脂肪指数
     */
    private BigDecimal visceralFatIndex;

    /**
     * 基础代谢率（kcal）
     */
    private BigDecimal bmr;

    /**
     * 水分（%）
     */
    private BigDecimal bodyWater;

    /**
     * 蛋白质（%）
     */
    private BigDecimal protein;

    /**
     * 骨量（KG）
     */
    private BigDecimal boneMass;

    /**
     * 储肌能力等级
     */
    private BigDecimal muscleResilienceLevel;
}
