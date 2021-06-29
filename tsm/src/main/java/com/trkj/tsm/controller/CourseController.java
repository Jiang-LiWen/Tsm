package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.CourseService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.CourseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/ClassesselectAllCourse")
    public List<CourseVo> selectAllCourse(){
        log.debug("班级查询所有课程信息---------------------------------------------------");
        List<CourseVo> entityPage =courseService.ClassesselectAllCourse();
        return entityPage;
    }

    @GetMapping("/selectAllCourse")
    public PageInfo<CourseVo> selectAllCourse(@RequestParam("currentPage") int currentPage,
                                              @RequestParam("pagesize") int pagesize,
                                              @RequestParam("sech") String likeke){
        log.debug("分页查询信息---------------------------------------------------");
        String likekes="%"+likeke+"%";
        PageHelper.startPage(currentPage,pagesize);
        List<CourseVo> entityPage =courseService.selectAllCourse(likekes);
        PageInfo<CourseVo> courseVoPageInfo = new  PageInfo<>(entityPage);
        return courseVoPageInfo;
    }
    @GetMapping("/selectAllCourse11")
    public List<CourseVo> selectAllCourse11(){
        List<CourseVo> entityPage =courseService.selectAllCourse11();
        log.debug(entityPage+"查询信息---------------------------------------------------");
        return entityPage;
    }

    @PutMapping("/updateCourseStateStop")
    public AjaxResponse updateCourseStateStop(@RequestBody @Valid CourseVo courseVo){
        courseVo.setStoptime(new Date());
        log.debug("课程停报");
        courseService.updateCourseStateStop(courseVo);
        return AjaxResponse.success(courseVo);
    }

    @PutMapping("/updateCourseStateBegin")
    public AjaxResponse updateCourseStateBegin(@RequestBody @Valid CourseVo courseVo){
        courseVo.setBegintime(new Date());
        log.debug("课程开报");
        courseService.updateCourseStateBegin(courseVo);
        return AjaxResponse.success(courseVo);
    }

    @PutMapping("/updateCourseclasshours")
    public AjaxResponse updateCourseclasshours(@RequestBody @Valid CourseVo courseVo){
        log.debug(courseVo+"111111111111111111111");
        courseService.updateCourseclasshours(courseVo);
        return AjaxResponse.success(courseVo);
    }

    @PostMapping("/insertCourse")
    public AjaxResponse insertCourse(@RequestBody @Valid CourseVo coursevo){
        log.debug(coursevo.toString()+"=================");
        log.debug("新增课程信息");
        courseService.insertCourse(coursevo);
        return AjaxResponse.success(coursevo);
    }

    @PutMapping("/updateCourse")
    public AjaxResponse updateCourse(@RequestBody @Valid CourseVo courseVo){
        courseVo.setUpdatetime(new Date());
        log.debug("课程开报");
        courseService.updateCourse(courseVo);
        return AjaxResponse.success(courseVo);
    }

}
