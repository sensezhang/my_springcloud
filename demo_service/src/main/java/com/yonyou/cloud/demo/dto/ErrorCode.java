package com.yonyou.cloud.demo.dto;

import lombok.Getter;

public enum ErrorCode {
  OK("0000", "操作成功"),
  UnknowError("9999", "未知错误"),
  IllParamError("1001", "参数不合法"),
  DataNotExistError("1002", "数据不存在"),
  FileTypeError("1003", "文件类型不合法"),
  FileSizeError("1004", "文件大小不合法"),
  ;

  @Getter
  private String code;
  @Getter
  private String desc;

  ErrorCode(String code, String desc) {
    this.code = code;
    this.desc = desc;
  }
}
