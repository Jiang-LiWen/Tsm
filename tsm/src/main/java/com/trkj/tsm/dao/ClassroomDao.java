package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Classroom;
import com.trkj.tsm.vo.ClassroomVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassroomDao {
    //删除
    int deleteByPrimaryKey(Integer classroomId);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    List<Classroom> selectByPrimaryKey(String classroomName);

    int updateByPrimaryKeySelective(ClassroomVo record);

    //批量删除
    int updateByPrimaryKey(ClassroomVo classroom);

    List<Classroom> selectAlls();

}