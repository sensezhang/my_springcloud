package com.yonyou.cloud.demo.repository;

import java.util.*;
import com.yonyou.cloud.demo.entity.InvApplyBVO;
import com.yonyou.cloud.demo.entity.InvApplyBVOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * 电子票据开票申请子表的mapper inv_apply_b
 *
 * @author zhangwbin
 */
@Mapper
@Repository
public interface InvApplyBVOMapper {

  int countByExample(@Param("example") InvApplyBVOExample example);

  int deleteByExample(@Param("example") InvApplyBVOExample example);

  int insert(InvApplyBVO record);

  int insertSelective(InvApplyBVO record);

  int insertInvApplyBVOList(@Param("list") List<InvApplyBVO> list);

  InvApplyBVO selectById(@Param("id") Long id, @Param("example") InvApplyBVOExample example);

  List<InvApplyBVO> selectByExample(@Param("example") InvApplyBVOExample example);

  int updateByExampleSelective(@Param("record") InvApplyBVO record,
      @Param("example") InvApplyBVOExample example);

  int updateByExample(@Param("record") InvApplyBVO record,
      @Param("example") InvApplyBVOExample example);

  int updateInvApplyBVOList(@Param("recordList") List<InvApplyBVO> recordList,
      @Param("example") InvApplyBVOExample example);

}