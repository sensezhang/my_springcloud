package com.yonyou.cloud.feign.servise;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-provider")
public interface HelloService {

  @RequestMapping("/hello/{name}")
  String hello(@PathVariable("name") String name);


  @RequestMapping(value = "invoice/query", method = RequestMethod.POST)
  String query(@RequestBody String fpqqlsh);
}
