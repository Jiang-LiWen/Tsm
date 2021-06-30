package com.trkj.tsm.service;

import com.trkj.tsm.vo.BackVo;

import java.util.List;

public interface BackService {
//    根据学生姓名进行模糊查询
    List<BackVo> selectLikeStudentName(String studentname);
//    删除修改时效性
    BackVo updateBackTimeLiness(BackVo backVo);
//    修改
    BackVo updateBack(BackVo backVo);
//    审批
    BackVo updateBackApproval(BackVo backVo);
//    取消复课
    int delRowFrom(Integer backId);
//    增加
    BackVo insertBack(BackVo backVo);
}
