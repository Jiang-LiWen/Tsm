package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Course;
import com.trkj.tsm.vo.CourseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {
    List<CourseVo> selectAllCourse();//页面显示加分页查询

    int updateCourseStateStop(Course record);//停报修改

    int updateCourseStateBegin(Course record);//开报修改

    int insertCourse(Course record);//添加课程

    int updateCourse(Course record);//修改课程

    int updateCourseclasshours(Course record);//修改课时量信息
//    int deleteByPrimaryKey(Integer courseId);
//
//    int insert(Course record);
//
//    int insertSelective(Course record);
//
//    Course selectByPrimaryKey(Integer courseId);
//
//    int updateByPrimaryKeySelective(Course record);
//
//    int updateByPrimaryKey(Course record);
}