package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Classroom;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassroomDao {
    //删除
    int deleteByPrimaryKey(Integer classroomId);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    List<Classroom> selectByPrimaryKey(String classroomName);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);

    List<Classroom> selectAlls();

}