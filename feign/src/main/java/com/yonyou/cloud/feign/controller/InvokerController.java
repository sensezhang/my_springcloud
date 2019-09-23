package com.yonyou.cloud.feign.controller;

import com.yonyou.cloud.feign.servise.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvokerController {

  @Autowired
  private HelloService helloService;

  @RequestMapping("/hello/{name}")
  public String hello(@PathVariable String name) {
    return helloService.hello(name);
  }

  @RequestMapping(value = "/invoice/query", method = RequestMethod.POST)
  public String query(@RequestBody String fpqqlsh) {
    return helloService.query(fpqqlsh);
  }
}
