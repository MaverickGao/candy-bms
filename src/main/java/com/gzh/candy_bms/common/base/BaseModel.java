package com.gzh.candy_bms.common.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类公共对象
 *
 * @author gaozhiheng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 创建人
     */
    @TableField(value = "creator", fill = FieldFill.INSERT)
    private String creator;

    /**
     * 创建时间
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private String createTime;

    /**
     * 修改人
     */
    @TableField(value = "modifier", fill = FieldFill.INSERT)
    private String modifier;

    /**
     * 最后修改时间
     */
    @TableField(value = "last_modify_time", fill = FieldFill.INSERT_UPDATE)
    private String lastModifyTime;

    /**
     * 删除标识
     */
    @TableField(value = "delete_flag", fill = FieldFill.INSERT)
    private String deleteFlag;
}
