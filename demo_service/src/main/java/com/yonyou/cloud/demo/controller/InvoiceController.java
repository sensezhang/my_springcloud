package com.yonyou.cloud.demo.controller;

import com.yonyou.cloud.demo.dto.BaseResult;
import com.yonyou.cloud.demo.dto.invoice.ApplyResponse;
import com.yonyou.cloud.demo.service.ApplyService;
import com.yonyou.cloud.demo.utils.ResultUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class InvoiceController {

  @Autowired
  private ApplyService applyService;

  @ApiOperation(value = "查询", notes = "一对多查询实例")
  @ApiImplicitParam(name = "fpqqlsh", value = "发票流水号12345678901234567891", required = true, dataType = "String")
  @RequestMapping(value = "invoice/query", method = RequestMethod.POST)
  @ResponseBody
  public BaseResult query(@RequestBody String fpqqlsh) {
    ApplyResponse applyResponse = applyService.query(fpqqlsh);
    if (applyResponse == null) {
      return ResultUtils.dataNotExistError();
    }
    return ResultUtils.ok(applyResponse);
  }
}
