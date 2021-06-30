package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Semester;
import com.trkj.tsm.vo.SemesterVo;
import com.trkj.tsm.vo.SessionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SemesterDao {
    int deleteByPrimaryKey(Integer semesterId);

    int insert(Semester semester);

    int selectByPrimaryKey(Integer semesterId);

    int updateByPrimaryKey(Semester semester);

    List<SemesterVo> selectSemester();

    List<SemesterVo> selectfindslike(String likeke);//页面显示加分页模糊查询
}