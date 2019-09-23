package com.yonyou.cloud.demo.dto.invoice;

import com.alibaba.fastjson.annotation.JSONField;
import com.yonyou.cloud.demo.entity.InvApplyBVO;
import com.yonyou.cloud.demo.entity.InvApplyVO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApplyResponse {

  private String fpqqlsh;
  private int statusCode;
  private String statusMsg;
  private ApplyData data;

  public ApplyResponse(InvApplyVO invApply, List<InvApplyBVO> invApplyB) {
    this.fpqqlsh = invApply.getFpqqlsh();
    this.statusCode = invApply.getStatusCode();
    this.statusMsg = ApplyStatusCode.getStatusCode(this.statusCode).getDesc();
    if (ApplyStatusCode.SUCCESS.getCode() == this.statusCode) {
      ApplyData applyData = new ApplyData();
      BeanUtils.copyProperties(invApply, applyData);
      List<ApplyItem> items = new ArrayList<>();
      invApplyB.forEach(invApplyB1 -> {
        ApplyItem applyItem = new ApplyItem();
        BeanUtils.copyProperties(invApplyB1, applyItem);
        items.add(applyItem);
      });

      applyData.setItems(items);
      this.data = applyData;
    }
  }
}

@Getter
@Setter
@ToString
@NoArgsConstructor
class ApplyData {

  private String einvoiceCode;
  private String einvoiceNumber;
  private String randomNumber;
  @JSONField(format = "yyyyMMdd")
  private Date issueDate;
  @JSONField(format = "#0.00")
  private BigDecimal totalAmount;
  private String handlingPerson;
  private String payerPartyName;
  private List<ApplyItem> items;
}

@Getter
@Setter
@ToString
@NoArgsConstructor
class ApplyItem {

  private String itemCode;
  private String itemName;
  private String itemUnit;
  private int itemQuantity;
  private BigDecimal itemStd;
  @JSONField(format = "#0.00")
  private BigDecimal itemAmount;
}
