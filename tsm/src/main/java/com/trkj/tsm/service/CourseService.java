package com.trkj.tsm.service;

import com.trkj.tsm.vo.CourseVo;

import java.util.List;

public interface CourseService {
    List<CourseVo> selectAllCourse11();

    List<CourseVo> ClassesselectAllCourse();//班级查询课程

    List<CourseVo> selectAllCourse(String likeke);//页面显示加分页查询

    CourseVo updateCourseStateStop(CourseVo courseVo);//停报修改

    CourseVo updateCourseStateBegin(CourseVo courseVo);//开报修改

    CourseVo insertCourse(CourseVo courseVo);//添加课程

    CourseVo updateCourse(CourseVo courseVo);//修改课程

    CourseVo updateCourseclasshours(CourseVo courseVo);//修改课时量
}
