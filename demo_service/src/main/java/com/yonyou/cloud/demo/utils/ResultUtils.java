package com.yonyou.cloud.demo.utils;

import com.yonyou.cloud.demo.dto.BaseResult;
import com.yonyou.cloud.demo.dto.ErrorCode;

public class ResultUtils {

  private static final BaseResult UNKNOW_ERROR = new BaseResult(ErrorCode.UnknowError);
  private static final BaseResult ILLPARAM_ERROR = new BaseResult(ErrorCode.IllParamError);
  private static final BaseResult DATA_NOT_EXIST_ERROR = new BaseResult(
      ErrorCode.DataNotExistError);
  private static final BaseResult FILE_TYPE_ERROR = new BaseResult(ErrorCode.FileTypeError);
  private static final BaseResult FILE_SIZE_ERROR = new BaseResult(ErrorCode.FileSizeError);

  public static BaseResult ok(Object data) {
    return new BaseResult(ErrorCode.OK, data);
  }


  public static BaseResult unknowError() {
    return UNKNOW_ERROR;
  }

  public static BaseResult illParamError() {
    return ILLPARAM_ERROR;
  }

  public static BaseResult dataNotExistError() {
    return DATA_NOT_EXIST_ERROR;
  }

  public static BaseResult fileTypeError() {
    return FILE_TYPE_ERROR;
  }

  public static BaseResult fileSizeError() {
    return FILE_SIZE_ERROR;
  }
}
