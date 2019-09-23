package com.yonyou.cloud.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseResult {

  private String code;
  private String msg;
  private Object data;

  public BaseResult(ErrorCode errorCode, Object data) {
    this.code = errorCode.getCode();
    this.msg = errorCode.getDesc();
    this.data = data;
  }

  public BaseResult(ErrorCode errorCode) {
    this.code = errorCode.getCode();
    this.msg = errorCode.getDesc();
  }
}
