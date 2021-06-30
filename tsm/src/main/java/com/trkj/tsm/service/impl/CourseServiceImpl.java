package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.CourseDao;
import com.trkj.tsm.entity.Course;
import com.trkj.tsm.service.CourseService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.CourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseDao courseDao;

    @Override
    public List<CourseVo> selectAllCourse11() {

        return courseDao.selectAllCourse11();
    }

    @Override
    public List<CourseVo> ClassesselectAllCourse() {
        return courseDao.ClassesselectAllCourse();
    }

    @Override
    public List<CourseVo> selectAllCourse(String likeke) {
        return courseDao.selectAllCourse(likeke);
    }


    @Override
    public CourseVo updateCourseStateStop(CourseVo courseVo) {
        log.debug("修改课程类别信息");
        Course d = new Course();
        BeanCopyUtil.copyProperties(courseVo,d);
        courseDao.updateCourseStateStop(d);
        return courseVo;
    }

    @Override
    public CourseVo updateCourseStateBegin(CourseVo courseVo) {
        log.debug("修改课程类别信息");
        Course d = new Course();
        BeanCopyUtil.copyProperties(courseVo,d);
        courseDao.updateCourseStateBegin(d);
        return courseVo;
    }

    @Override
    public CourseVo insertCourse(CourseVo courseVo) {
        log.debug("新增课程信息");
        Course d = new Course();
        BeanCopyUtil.copyProperties(courseVo,d);
        courseDao.insertCourse(d);
        return courseVo;
    }

    @Override
    public CourseVo updateCourse(CourseVo courseVo) {

        log.debug("修改课程类别信息");
        Course d = new Course();
        BeanCopyUtil.copyProperties(courseVo,d);
        courseDao.updateCourse(d);
        return courseVo;

    }

    @Override
    public CourseVo updateCourseclasshours(CourseVo courseVo) {
        log.debug("修改课时量信息");
        Course d = new Course();
        BeanCopyUtil.copyProperties(courseVo,d);
        courseDao.updateCourseclasshours(d);
        return courseVo;
    }
}
