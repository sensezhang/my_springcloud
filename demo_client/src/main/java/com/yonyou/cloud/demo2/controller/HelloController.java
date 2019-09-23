package com.yonyou.cloud.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${practice.url}")
  private String PRACTICE_URL;

  @RequestMapping("/hello/{name}")
  public String hello(@PathVariable("name") String name) {
    String result = restTemplate.getForObject(PRACTICE_URL + "hello/" + name, String.class);
    return result;
  }
}
