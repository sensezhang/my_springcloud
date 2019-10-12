package com.yonyou.cloud.demo.dto;

import javax.servlet.http.HttpServletResponse;
import lombok.Getter;

public enum ErrorCode {
  OK("0000", "操作成功"),
  UnknowError("9999", "未知错误"),
  IllParamError("1001", "参数不合法"),
  DataNotExistError("1002", "数据不存在"),
  FileTypeError("1003", "文件类型不合法"),
  FileSizeError("1004", "文件大小不合法"),
  FileNotExist("1005", "文件不存在"),


  NOT_FOUND(String.valueOf(HttpServletResponse.SC_NOT_FOUND), "404 Not Found"),
  MSG_NOT_READABLE(String.valueOf(HttpServletResponse.SC_BAD_REQUEST), "Message Can't be Read"),
  METHOD_NOT_SUPPORTED(String.valueOf(HttpServletResponse.SC_METHOD_NOT_ALLOWED), "Method Not Supported"),
  MEDIA_TYPE_NOT_SUPPORTED(String.valueOf(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE), "Media Type Not Supported"),
  PARAM_MISS(String.valueOf(HttpServletResponse.SC_BAD_REQUEST), "Missing Required Parameter"),
  PARAM_TYPE_ERROR(String.valueOf(HttpServletResponse.SC_BAD_REQUEST), "Parameter Type Mismatch"),
  PARAM_BIND_ERROR(String.valueOf(HttpServletResponse.SC_BAD_REQUEST), "Parameter Binding Error"),
  PARAM_VALID_ERROR(String.valueOf(HttpServletResponse.SC_BAD_REQUEST), "Parameter Validation Error")
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
