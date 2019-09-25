package com.yonyou.cloud.zuul.filter;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.yonyou.cloud.util.JWTUtils;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@ConfigurationProperties(prefix = "filter.url")
@Getter
@Setter
public class AuthFilter extends ZuulFilter {

  private List<String> lists;

  /**
   * 过滤器类型，前置过滤器
   *
   * @return
   */
  @Override
  public String filterType() {
    return PRE_TYPE;
  }

  /**
   * 过滤器顺序，越小越先执行
   *
   * @return
   */
  @Override
  public int filterOrder() {
    return 4;
  }

  /**
   * 过滤器是否生效
   *
   * @return
   */
  @Override
  public boolean shouldFilter() {
    RequestContext requestContext = RequestContext.getCurrentContext();
    HttpServletRequest request = requestContext.getRequest();

    //忽略大小写，返回true则拦截，进入run方法
    if (lists.contains(request.getRequestURI())) {
      return true;
    }

    return false;
  }

  @Override
  public Object run() throws ZuulException {
    //JWT
    RequestContext requestContext = RequestContext.getCurrentContext();
    HttpServletRequest request = requestContext.getRequest();

    //token对象
    String token = request.getHeader("token");

    //如果token字符串为空
    if (StringUtils.isBlank((token))) {
      token = request.getParameter("token");
    }
    if (!StringUtils.isBlank(token)) {
      if (JWTUtils.verify(token)) {
        String userName = JWTUtils.getUsername(token);
        log.info("验签通过，username:{}", userName);
        return null;
      }
    }
    log.info("签名验证失败,token:{}", token);
    //设置为false则不往下走(不调用api接口)
    requestContext.setSendZuulResponse(false);
    //响应一个状态码：401
    requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
    requestContext.setResponseBody("{\"result\":\"签名验签失败!\"}");
    requestContext.getResponse().setContentType("text/html;charset=UTF-8");
    return "error";
  }
}
