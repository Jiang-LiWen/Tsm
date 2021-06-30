package com.trkj.tsm.service;

import com.trkj.tsm.vo.ShiftVo;

import java.util.List;

public interface ShiftService {
    //  模糊查询显示
    List<ShiftVo> selectStudentNameLike(String studentname);
    //  模糊查询显示
//    List<ShiftVo> selectClassesOpen(String classesOpen);
//    删除修改时效性
    ShiftVo updateShiftTimeLiness(ShiftVo shiftVo);
//    审批
    ShiftVo updateShiftApproval(ShiftVo shiftVo);
//    增加
    ShiftVo insertShift(ShiftVo shiftVo);
//    修改转班理由
    ShiftVo updataShift(ShiftVo shiftVo);
}
