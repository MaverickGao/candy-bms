package com.gzh.candy_bms.tencentcloud.logic;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.gzh.candy_bms.common.enums.DeleteFlagEnum;
import com.gzh.candy_bms.tencentcloud.bean.model.TencentVideoStorageHistoryDO;
import com.gzh.candy_bms.tencentcloud.dao.TencentVideoStorageHistoryDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 腾讯云点播上传历史表 Logic
 *
 * @author gaozhiheng
 */
@Component
public class TencentVideoStorageHistoryLogic {

    @Resource
    private TencentVideoStorageHistoryDao tencentVideoStorageHistoryDao;

    /**
     * 新增数据
     *
     * @param insertInfo {@link TencentVideoStorageHistoryDO}
     */
    public void saveInfo(TencentVideoStorageHistoryDO insertInfo) {
        if (Objects.isNull(insertInfo)) {
            return;
        }
        tencentVideoStorageHistoryDao.save(insertInfo);
    }

    /**
     * 更新数据
     *
     * @param updateInfo {@link TencentVideoStorageHistoryDO}
     */
    public void updateInfo(TencentVideoStorageHistoryDO updateInfo) {
        if (Objects.isNull(updateInfo)) {
            return;
        }
        tencentVideoStorageHistoryDao.updateById(updateInfo);
    }

    /**
     * 根据ID查询数据
     *
     * @param id 主键ID
     * @return 查询出的数据
     */
    public TencentVideoStorageHistoryDO queryById(String id) {
        if (StringUtils.isBlank(id)) {
            return null;
        }
        return tencentVideoStorageHistoryDao.getOne(
                Wrappers.<TencentVideoStorageHistoryDO>lambdaQuery()
                        .eq(TencentVideoStorageHistoryDO::getDeleteFlag, DeleteFlagEnum.UN_DELETED.getCode())
                        .eq(TencentVideoStorageHistoryDO::getId, id)
                        .last("limit 1")
        );
    }
}
