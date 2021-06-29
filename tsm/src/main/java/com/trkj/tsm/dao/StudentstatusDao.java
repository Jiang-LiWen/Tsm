package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Studentstatus;
import com.trkj.tsm.vo.StudentstatusVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentstatusDao {
    Studentstatus selectStudentstatusId(Integer Id);//通过学员id找学员状态

    List<StudentstatusVo> selectStudentstatusLike(String likeke1,String likeke2);//学员状态模糊查询

    int deleteStudentstatus(Studentstatus record);//删除学员状态

    int insertStudentstatus(Studentstatus record);//添加学员状态

    int updateStudentstatus(Studentstatus record);//学员状态
}