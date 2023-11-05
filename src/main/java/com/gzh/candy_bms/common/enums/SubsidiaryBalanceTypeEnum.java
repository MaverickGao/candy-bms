package com.gzh.candy_bms.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * 收支细分标志；
 * 0-固定收入；1-额外收入；2-固定支出；3-额外支出
 *
 * @author gaozhiheng
 */
@Getter
@AllArgsConstructor
public enum SubsidiaryBalanceTypeEnum {

    FIXED_REVENUES("0", "固定收入"),
    EXTRA_REVENUES("1", "额外收入"),
    FIXED_EXPENSES("2", "固定支出"),
    EXTRA_EXPENSES("3", "额外支出");

    /**
     * 枚举值
     */
    private final String code;

    /**
     * 枚举内容
     */
    private final String desc;

    /**
     * 根据code获取对应的描述
     *
     * @param code Code
     * @return name
     */
    public static String getNameByCode(String code) {
        for (SubsidiaryBalanceTypeEnum subsidiaryBalanceTypeEnum : SubsidiaryBalanceTypeEnum.values()) {
            if (StringUtils.equals(subsidiaryBalanceTypeEnum.getCode(), code)) {
                return subsidiaryBalanceTypeEnum.getDesc();
            }
        }
        return null;
    }
}
