package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Shift;
import com.trkj.tsm.vo.ShiftVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShiftDao {
//  模糊查询显示
    List<ShiftVo> selectStudentNameLike(String studentname);
    //  模糊查询显示
//    List<ShiftVo> selectClassesOpen(String classesOpen);
//    删除修改失效性
    int updateShiftTimeLiness(ShiftVo shiftVo);
//    审批
    int updateShiftApproval(ShiftVo shiftVo);
//    增加
    int insertShift(ShiftVo shiftVo);
//    修改转班理由
    int updataShift(ShiftVo shiftVo);
}