package com.yonyou.cloud.demo.dto.invoice;

import lombok.Getter;

/**
 * 票据状态 1-待开票 2-开票中 3-开票失败 4-开票成功
 */
public enum ApplyStatusCode {

  WAIT(1, "待开票"), APPLING(2, "开票中"), FAILED(3, "开票失败"), SUCCESS(4, "开票成功");

  @Getter
  private int code;
  @Getter
  private String desc;

  ApplyStatusCode(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  public static ApplyStatusCode getStatusCode(int code) {
    switch (code) {
      case 1:
        return WAIT;
      case 2:
        return APPLING;
      case 3:
        return FAILED;
      case 4:
        return SUCCESS;
      default:
        return WAIT;
    }
  }
}
