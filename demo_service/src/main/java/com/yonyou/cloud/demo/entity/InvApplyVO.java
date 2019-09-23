package com.yonyou.cloud.demo.entity;

import java.util.*;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * 电子票据开票申请主表的实体类 inv_apply
 *
 * @author zhangwbin
 */
@Getter
@Setter
public class InvApplyVO {

  /**
   * inv_apply.id
   */
  private Long id;
  /**
   * inv_apply.fpqqlsh
   */
  private String fpqqlsh;
  /**
   * inv_apply.einvoice_code
   */
  private String einvoiceCode;
  /**
   * inv_apply.einvoice_number
   */
  private String einvoiceNumber;
  /**
   * inv_apply.random_number
   */
  private String randomNumber;
  /**
   * inv_apply.total_amount
   */
  private BigDecimal totalAmount;
  /**
   * inv_apply.issue_date
   */
  private Date issueDate;
  /**
   * inv_apply.payer_party_name
   */
  private String payerPartyName;
  /**
   * inv_apply.remark
   */
  private String remark;
  /**
   * inv_apply.handling_person
   */
  private String handlingPerson;
  /**
   * inv_apply.status_code
   */
  private Integer statusCode;
  /**
   * inv_apply.create_time
   */
  private Date createTime;
  /**
   * inv_apply.ts
   */
  private Date ts;

}