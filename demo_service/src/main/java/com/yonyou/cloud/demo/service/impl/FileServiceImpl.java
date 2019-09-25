package com.yonyou.cloud.demo.service.impl;

import com.yonyou.cloud.demo.constant.RedisKeyConstant;
import com.yonyou.cloud.demo.service.FileService;
import com.yonyou.cloud.demo.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zhangwbin
 * @Date: 2019/9/23
 */
@Service
public class FileServiceImpl implements FileService {

  @Autowired
  private RedisUtil redisUtil;

  @Override
  public String generateFileId(String fileName) {
    String id = String.valueOf(System.currentTimeMillis());
    redisUtil.set(RedisKeyConstant.FILE_ID_NAME_PREFIX + id, fileName);
    redisUtil.expire(RedisKeyConstant.FILE_ID_NAME_PREFIX + id, 60 * 60);
    return id;
  }

  @Override
  public String getFileNameById(String id) {
    return String.valueOf(redisUtil.get(RedisKeyConstant.FILE_ID_NAME_PREFIX + id));
  }

}
