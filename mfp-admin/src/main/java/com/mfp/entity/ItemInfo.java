package com.mfp.entity;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class ItemInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * 商品ID
   */
  @TableId(value = "item_id", type = IdType.AUTO)
  private Long itemId;

  /**
   * 商品名称
   */
  private String itemName;

  /**
   * 商品描述
   */
  private String itemDesc;

  /**
   * 商品价格
   */
  private BigDecimal itemPrice;

  /**
   * 商品图片URL
   */
  private String itemPicUrl;

  /**
   * 创建时间
   */
  @TableField(fill = FieldFill.INSERT)
  private Date createTime;

  /**
   * 更新时间
   */
  @TableField(fill = FieldFill.INSERT_UPDATE)
  private Date updateTime;

  /**
   * 删除标志，0-未删除，1-已删除
   */
  private String deleted;

  /**
   * 创建人
   */
  private String createBy;

  /**
   * 更新人
   */
  @TableField(value = "update_by")
  private String updateBy;
}
