package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Suspende;
import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.SuspendeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SuspendeDao {
    //    根据学生姓名查询
    List<SuspendeVo> selectStudentNameLike(String studentname);
    //    增加
    int insertSuspende(SuspendeVo record);
    //    删除（修改时效性）
    int updateSuspendeTimeLiness(SuspendeVo suspendeVo);
    //    修改
    int updateSuspen(SuspendeVo suspendeVo);
    //    修改退学状态
    int updateSuspenStatus(SuspendeVo suspendeVo);
    //    取消退学（删除数据库表数据）
    int delRowFrom(Integer suspendeId);
}