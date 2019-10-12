package com.yonyou.cloud.demo.exception;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.demo.dto.BaseResult;
import com.yonyou.cloud.demo.dto.ErrorCode;
import com.yonyou.cloud.demo.utils.ResultUtils;
import java.io.FileNotFoundException;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public BaseResult handleError(MissingServletRequestParameterException e) {
    log.warn("Missing Request Parameter", e);
    String message = String.format("Missing Request Parameter: %s", e.getParameterName());
    return new BaseResult(ErrorCode.PARAM_MISS, message);
  }

  @ExceptionHandler(MethodArgumentTypeMismatchException.class)
  public BaseResult handleError(MethodArgumentTypeMismatchException e) {
    log.warn("Method Argument Type Mismatch", e);
    String message = String.format("Method Argument Type Mismatch: %s", e.getName());
    return new BaseResult(ErrorCode.PARAM_TYPE_ERROR, message);
  }

  @ExceptionHandler(MethodArgumentNotValidException.class)
  public BaseResult handleError(MethodArgumentNotValidException e) {
    log.warn("Method Argument Not Valid", e);
    BindingResult result = e.getBindingResult();
    FieldError error = result.getFieldError();
    String message = String.format("%s:%s", error.getField(), error.getDefaultMessage());
    return new BaseResult(ErrorCode.PARAM_VALID_ERROR, message);
  }

  @ExceptionHandler(BindException.class)
  public BaseResult handleError(BindException e) {
    log.warn("Bind Exception", e);
    FieldError error = e.getFieldError();
    String message = String.format("%s:%s", error.getField(), error.getDefaultMessage());
    return new BaseResult(ErrorCode.PARAM_BIND_ERROR, message);
  }


  @ExceptionHandler(NoHandlerFoundException.class)
  public BaseResult handleError(NoHandlerFoundException e) {
    log.error("404 Not Found", e);
    return new BaseResult(ErrorCode.NOT_FOUND, e.getMessage());
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public BaseResult handleError(HttpMessageNotReadableException e) {
    log.error("Message Not Readable", e);
    return new BaseResult(ErrorCode.MSG_NOT_READABLE, e.getMessage());
  }

  @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
  public BaseResult handleError(HttpRequestMethodNotSupportedException e) {
    log.error("Request Method Not Supported", e);
    return new BaseResult(ErrorCode.METHOD_NOT_SUPPORTED, e.getMessage());
  }

  @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
  public BaseResult handleError(HttpMediaTypeNotSupportedException e) {
    log.error("Media Type Not Supported", e);
    return new BaseResult(ErrorCode.MEDIA_TYPE_NOT_SUPPORTED, e.getMessage());
  }

  /**
   * 捕获异常MaxUploadSizeExceededException
   * @param e
   * @return
   */
  @ExceptionHandler(MaxUploadSizeExceededException.class)
  public BaseResult handleMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
    log.warn("上传文件大小错误", e);
    return new BaseResult(ErrorCode.FileSizeError, e.getMessage());
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
