package com.yonyou.cloud.demo.service.impl;

import com.yonyou.cloud.demo.constant.RedisKeyConstant;
import com.yonyou.cloud.demo.dto.invoice.ApplyResponse;
import com.yonyou.cloud.demo.entity.InvApplyBVO;
import com.yonyou.cloud.demo.entity.InvApplyBVOExample;
import com.yonyou.cloud.demo.entity.InvApplyVO;
import com.yonyou.cloud.demo.entity.InvApplyVOExample;
import com.yonyou.cloud.demo.repository.InvApplyBVOMapper;
import com.yonyou.cloud.demo.repository.InvApplyVOMapper;
import com.yonyou.cloud.demo.service.ApplyService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ApplyServiceImpl implements ApplyService {

  @Autowired
  private InvApplyVOMapper invApplyVOMapper;

  @Autowired
  private InvApplyBVOMapper invApplyBVOMapper;

  @Override
  @Cacheable(value = RedisKeyConstant.PRACTICE_INVOICE_PREFIX, key = "#fplsh")
  public ApplyResponse query(String fplsh) {
    InvApplyVOExample invApplyVOExample = new InvApplyVOExample();
    invApplyVOExample.addPageNumAndPageSize(1, 1).createCriteria().andFpqqlshEqualTo(fplsh);
    List<InvApplyVO> invApplys = invApplyVOMapper.selectByExample(invApplyVOExample);
    if (invApplys == null || invApplys.isEmpty()) {
      return null;
    }
    InvApplyBVOExample invApplyBVOExample = new InvApplyBVOExample();
    invApplyBVOExample.createCriteria().andHidEqualTo(invApplys.get(0).getId());
    List<InvApplyBVO> invApplyBVOS = invApplyBVOMapper.selectByExample(invApplyBVOExample);
    if (invApplyBVOS == null || invApplyBVOS.isEmpty()) {
      log.warn("查询票据子表错误，数据不存在");
    }
    ApplyResponse applyResponse = new ApplyResponse(invApplys.get(0), invApplyBVOS);
    return applyResponse;
  }
}
