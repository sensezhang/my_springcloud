package com.yonyou.cloud.demo2.utils;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class RestUtil {

  @Autowired
  private RestTemplate restTemplate;

  /**
   * DLT专用执行方法
   *
   * @param param  请求参数：可以添加一些常量请求值
   * @param url    访问的url
   * @param method 请求的方法
   * @return
   */
  public String execute(Map<String, Object> param, String url, HttpMethod method) {
    HttpHeaders headers = this.getDefaultHeader();
    HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(param, headers);
    ResponseEntity<String> response = restTemplate
        .exchange(url, method, requestEntity, String.class);
    return response.getBody();
  }

  public RestTemplate getRestTemplate() {
    return this.restTemplate;
  }

  /**
   * get请求
   *
   * @param url      请求的url
   * @param jsonData 请求的json
   * @return
   */
  public String restGet(String url, String jsonData) {
    return request(url, jsonData, HttpMethod.GET);

  }

  /**
   * Get请求获取实体类
   *
   * @param url          请求的url
   * @param responseType 返回的类型
   * @param parms        不限定个数的参数
   * @param <T>          泛型
   * @return
   */
  public <T> T getForEntity(String url, Class<T> responseType, Object... parms) {
    return (T) restTemplate.getForEntity(url, responseType, parms);

  }

  /**
   * @param url        请求的url
   * @param jsonData   json数据
   * @param httpMethod
   * @return
   */
  private String request(String url, String jsonData, HttpMethod httpMethod) {
    ResponseEntity<String> response;
    try {
      if (StringUtils.isEmpty(url)) {
        throw new IllegalArgumentException("url is null!");
      }
      HttpEntity<String> requestEntity = new HttpEntity<>(jsonData);
      response = restTemplate.exchange(url, httpMethod, requestEntity, String.class);
    } catch (Exception ex) {
      log.error("请求失败", ex);
      return "";
    }
    String result = response.getBody();
    log.info("请求url:{},result:{}", url, result);
    return result;
  }

  /**
   * 获取默认的头请求信息
   *
   * @return
   */
  public HttpHeaders getDefaultHeader() {
    String timestamp = "" + System.currentTimeMillis();
    HttpHeaders headers = new HttpHeaders();
    headers.add("timestamp", timestamp);
    return headers;
  }
}
