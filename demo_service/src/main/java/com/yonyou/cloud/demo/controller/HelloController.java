package com.yonyou.cloud.demo.controller;

import com.yonyou.cloud.demo.dto.BaseResult;
import com.yonyou.cloud.demo.dto.hello.User;
import com.yonyou.cloud.demo.service.HelloService;
import com.yonyou.cloud.demo.utils.ResultUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class HelloController {

  @Autowired
  private HelloService helloService;

  @ResponseBody
  @RequestMapping(path = "hello/{name}")
  @ApiOperation(value = "hello", notes = "hello world", httpMethod = "GET")
  @ApiImplicitParam(name = "name", value = "hello name", required = true, dataType = "String", paramType = "path")
  public BaseResult restService(@PathVariable String name) {
    User user = helloService.hello(name);
    return ResultUtils.ok(user);
  }
}
