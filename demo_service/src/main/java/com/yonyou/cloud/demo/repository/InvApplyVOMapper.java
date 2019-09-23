package com.yonyou.cloud.demo.repository;

import java.util.*;
import com.yonyou.cloud.demo.entity.InvApplyVO;
import com.yonyou.cloud.demo.entity.InvApplyVOExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * 电子票据开票申请主表的mapper inv_apply
 *
 * @author zhangwbin
 */
@Mapper
@Repository
public interface InvApplyVOMapper {

  int countByExample(@Param("example") InvApplyVOExample example);

  int deleteByExample(@Param("example") InvApplyVOExample example);

  int insert(InvApplyVO record);

  int insertSelective(InvApplyVO record);

  int insertInvApplyVOList(@Param("list") List<InvApplyVO> list);

  InvApplyVO selectById(@Param("id") Long id, @Param("example") InvApplyVOExample example);

  List<InvApplyVO> selectByExample(@Param("example") InvApplyVOExample example);

  int updateByExampleSelective(@Param("record") InvApplyVO record,
      @Param("example") InvApplyVOExample example);

  int updateByExample(@Param("record") InvApplyVO record,
      @Param("example") InvApplyVOExample example);

  int updateInvApplyVOList(@Param("recordList") List<InvApplyVO> recordList,
      @Param("example") InvApplyVOExample example);

}