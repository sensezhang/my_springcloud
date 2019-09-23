package com.yonyou.cloud.demo.service.impl;

import com.yonyou.cloud.demo.dto.hello.User;
import com.yonyou.cloud.demo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangwbin
 * @Date: 2019/9/17
 */
@Service
public class HelloServiceImpl implements HelloService {

  @Override
  public User hello(String name) {
    return new User(name);
  }
}
