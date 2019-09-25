package com.yonyou.cloud.demo.exception;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.demo.dto.BaseResult;
import com.yonyou.cloud.demo.utils.ResultUtils;
import java.io.FileNotFoundException;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  // spring默认上传大小1MB 超出大小捕获异常MaxUploadSizeExceededException */
  @ExceptionHandler(MaxUploadSizeExceededException.class)
  public BaseResult handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
    return ResultUtils.fileSizeError();
  }

  @ExceptionHandler(FileNotFoundException.class)
  public BaseResult fileNotFoundException(HttpServletRequest request, Throwable ex) {
    String requestParam =
        "请求" + request.getRequestURI() + "处理异常,请求的数据是:" + getRequestParams(request);
    log.error(requestParam, ex);
    return ResultUtils.fileNotExistError();
  }

  @ExceptionHandler({Exception.class, Throwable.class})
  public BaseResult throwable(HttpServletRequest request, Throwable ex) {
    String requestParam =
        "请求" + request.getRequestURI() + "处理异常,请求的数据是:" + getRequestParams(request);
    log.error(requestParam, ex);
    return ResultUtils.unknowError();
  }

  protected String getRequestParams(HttpServletRequest request) {
    return JSON.toJSONString(request.getParameterMap());
  }
}
