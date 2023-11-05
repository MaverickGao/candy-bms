package com.gzh.candy_bms.pojo.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 体征指标管理新增 Request
 *
 * @author gaozhiheng
 */
@Setter
@Getter
@Builder
@ToString
public class InsertPhysicalIndexRecordRequest implements Serializable {

    private static final long serialVersionUID = 7480178812051544773L;
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
     * 身高（CM）
     */
    @NotNull(message = "请输入身高")
    private BigDecimal height;

    /**
     * 体重（KG）
     */
    @NotNull(message = "请输入体重")
    private BigDecimal weight;

    /**
     * 体脂率（%）
     */
    @NotNull(message = "请输入体脂率")
    private BigDecimal bodyFat;

    /**
     * 肌肉率（%）
     */
    @NotNull(message = "请输入肌肉率")
    private BigDecimal muscleRate;

    /**
     * 内脏脂肪指数
     */
    @NotNull(message = "请输入内脏脂肪指数")
    private BigDecimal visceralFatIndex;

    /**
     * 基础代谢率（kcal）
     */
    @NotNull(message = "请输入基础代谢率")
    private BigDecimal bmr;

    /**
     * 水分（%）
     */
    @NotNull(message = "请输入水分")
    private BigDecimal bodyWater;

    /**
     * 蛋白质（%）
     */
    @NotNull(message = "请输入蛋白质")
    private BigDecimal protein;

    /**
     * 骨量（KG）
     */
    @NotNull(message = "请输入骨量")
    private BigDecimal boneMass;

    /**
     * 储肌能力等级
     */
    @NotNull(message = "请输入储肌能力等级")
    private BigDecimal muscleResilienceLevel;
}
