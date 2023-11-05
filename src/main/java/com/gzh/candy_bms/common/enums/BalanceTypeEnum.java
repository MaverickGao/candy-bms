package com.gzh.candy_bms.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

/**
 * 收支标志；0-收入；1-支出
 *
 * @author gaozhiheng
 */
@Getter
@AllArgsConstructor
public enum BalanceTypeEnum {
    REVENUES("0", "收入"),
    EXPENSES("1", "支出");

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
        for (BalanceTypeEnum balanceTypeEnum : BalanceTypeEnum.values()) {
            if (StringUtils.equals(balanceTypeEnum.getCode(), code)) {
                return balanceTypeEnum.getDesc();
            }
        }
        return null;
    }
}
