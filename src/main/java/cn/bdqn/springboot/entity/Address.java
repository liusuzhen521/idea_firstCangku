package cn.bdqn.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangxiangyang
 * @since 2020-01-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("smbms_address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 联系人姓名
     */
    private String contact;

    /**
     * 收货地址明细
     */
    @TableField("addressDesc")
    private String addressDesc;

    /**
     * 邮编
     */
    @TableField("postCode")
    private String postCode;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 创建者
     */
    @TableField("createdBy")
    private Long createdBy;

    /**
     * 创建时间
     */
    @TableField("creationDate")
    private LocalDateTime creationDate;

    /**
     * 修改者
     */
    @TableField("modifyBy")
    private Long modifyBy;

    /**
     * 修改时间
     */
    @TableField("modifyDate")
    private LocalDateTime modifyDate;

    /**
     * 用户ID
     */
    @TableField("userId")
    private Long userId;


}
