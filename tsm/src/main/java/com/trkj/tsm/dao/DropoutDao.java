package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Classroom;
import com.trkj.tsm.entity.Dropout;
import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DropoutDao {
//    根据学生姓名查询
    List<DropoutVo> selectStudentNameLike(String studentname);
    //    增加
    int insertDropOut(DropoutVo record);
    //    删除（修改时效性）
    int updateDropOutTimeLiness(DropoutVo dropoutVo);
    //    修改
    int updateDropOut(DropoutVo dropoutVo);
//    修改退学状态
    int updateDropOutDropoutStatus(DropoutVo dropoutVo);
    //    取消退学（删除数据库表数据）
    int delRowFrom(Integer dropId);
}