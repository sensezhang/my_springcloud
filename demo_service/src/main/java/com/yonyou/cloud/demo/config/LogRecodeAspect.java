package com.yonyou.cloud.demo.config;

import com.yonyou.cloud.demo.utils.RequestUtil;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Slf4j
@Aspect
@Configuration
public class LogRecodeAspect {


  @Pointcut("execution(public * com.yonyou.cloud.demo.controller.*.*(..)))")
  public void log() {

  }

  @Before("log()")
  public void doBefore(JoinPoint joinPoint) {
    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
        .getRequestAttributes();
    HttpServletRequest request = attributes.getRequest();

    // 记录下请求内容
    log.debug("请求地址 : " + request.getRequestURL().toString());
    log.debug("HTTP METHOD : " + request.getMethod());
    // 获取真实的ip地址
    log.debug("IP : " + RequestUtil.getRemortIP(request));
    log.debug("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
        + joinPoint.getSignature().getName());
    log.debug("参数 : " + Arrays.toString(joinPoint.getArgs()));
  }

  @Around("log()")
  public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    try {
      long startTime = System.currentTimeMillis();
      Object ob = proceedingJoinPoint.proceed();
      log.debug("耗时 : " + (System.currentTimeMillis() - startTime));
      return ob;
    } catch (Exception e) {
      log.error("error:", e);
      throw e;

    }
  }

  @AfterReturning(pointcut = "log()", returning = "object")//打印输出结果
  public void doAfterReturing(Object object) {
    log.info("response={}", object.toString());
  }
}