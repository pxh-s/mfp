package com.mfp.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("item_info")
public class ItemInfo {

  private long itemId;
  private String itemName;
  private String itemDesc;
  private double itemPrice;
  private String itemPicUrl;
  private Date createTime;
  private Date updateTime;
  private long deleted;
  private String createBy;
  private String updateBy;
}
