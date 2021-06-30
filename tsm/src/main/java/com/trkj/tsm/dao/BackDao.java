package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Back;
import com.trkj.tsm.vo.BackVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BackDao {
//查询显示
    List<BackVo> selectLikeStudentName(String studentname);
//删除修改时效性
    int updateBackTimeLiness(BackVo backVo);
//    修改
    int updateBack(BackVo backVo);
//    审批
    int updateBackApproval(BackVo backVo);
//取消复课
    int delRowFrom(Integer backId);
//    增加
    int insertBack(BackVo backVo);
}