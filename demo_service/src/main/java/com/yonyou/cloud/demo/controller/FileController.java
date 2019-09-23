package com.yonyou.cloud.demo.controller;

import com.yonyou.cloud.demo.dto.BaseResult;
import com.yonyou.cloud.demo.service.FileService;
import com.yonyou.cloud.demo.utils.ResultUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.io.File;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
public class FileController {

  @Value("${upload.file.path}")
  private String saveFilePath;

  @Autowired
  private FileService fileService;

  @ApiOperation(value = "发票上传", notes = "发票上传")
  @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
  @ResponseBody
  public BaseResult uploadFile(
      @ApiParam(value = "上传的文件", required = true) @RequestParam("file") MultipartFile file)
      throws IOException {
    if (file != null) {
      String name = file.getOriginalFilename();
      long size = file.getSize();
      log.debug("name:{}, size:{}", name, size);
      // 文件保存服务器
      String fileName = saveFilePath + File.separator + name;
      FileUtils.writeByteArrayToFile(new File(fileName), file.getBytes());
      return ResultUtils.ok(fileService.generateFileId(fileName));
    }
    return ResultUtils.dataNotExistError();
  }

  @ApiOperation(value = "发票下载", notes = "发票下载")
  @ApiImplicitParam(name = "fileId", value = "发票ID", required = true, dataType = "String", paramType = "path")
  @RequestMapping(value = "download/{fileId}", method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<byte[]> downloadFile(@PathVariable(value = "fileId") String fileId)
      throws IOException {
    log.debug("下载文件id:{}", fileId);
    String fileName = fileService.getFileNameById(fileId);
    byte[] bytes = FileUtils.readFileToByteArray(new File(fileName));
    HttpHeaders header = new HttpHeaders();
    header.add("Content-Disposition", "attachment;filename=" + fileId);
    ResponseEntity<byte[]> entity = new ResponseEntity<>(
        bytes == null ? new byte[0] : bytes, header, HttpStatus.OK);
    return entity;
  }
}
