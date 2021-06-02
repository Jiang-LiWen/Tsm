package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Semester;
import com.trkj.tsm.vo.SemesterVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SemesterDao {
    int deleteByPrimaryKey(Integer semesterId);

    int insert(Semester semester);

    int selectByPrimaryKey(Integer semesterId);

    int updateByPrimaryKey(Semester semester);

    List<SemesterVo> selectSemester();
}