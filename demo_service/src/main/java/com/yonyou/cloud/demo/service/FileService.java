package com.yonyou.cloud.demo.service;

/**
 * @Author: zhangwbin
 * @Date: 2019/9/23
 */
public interface FileService {

  String generateFileId(String fileName);

  String getFileNameById(String id);
}
