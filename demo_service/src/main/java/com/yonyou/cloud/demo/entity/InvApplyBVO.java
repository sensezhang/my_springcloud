package com.yonyou.cloud.demo.entity;

import java.util.*;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * 电子票据开票申请子表的实体类 inv_apply_b
 *
 * @author zhangwbin
 */
@Getter
@Setter
public class InvApplyBVO {

  /**
   * inv_apply_b.id
   */
  private Long id;
  /**
   * inv_apply_b.hid
   */
  private Long hid;
  /**
   * inv_apply_b.item_code
   */
  private String itemCode;
  /**
   * inv_apply_b.item_name
   */
  private String itemName;
  /**
   * inv_apply_b.item_amount
   */
  private BigDecimal itemAmount;
  /**
   * inv_apply_b.item_unit
   */
  private String itemUnit;
  /**
   * inv_apply_b.item_quantity
   */
  private Integer itemQuantity;
  /**
   * inv_apply_b.item_std
   */
  private BigDecimal itemStd;
  /**
   * inv_apply_b.create_time
   */
  private Date createTime;
  /**
   * inv_apply_b.ts
   */
  private Date ts;

}