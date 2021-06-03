package com.trkj.tsm.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Classroom;
import com.trkj.tsm.service.ClassroomService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.ClassroomVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j

public class ClassRoomController {

    @Resource
    private ClassroomService classroomService;

    //显示教室表的全部内容
    @GetMapping("/selectAlls")
    public PageInfo<Classroom> selectAllSources(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("--------------------");
        List<Classroom> entityPage=classroomService.selectAlls();
        PageInfo<Classroom> ClassrommVoPageInfo=new PageInfo<>(entityPage);
        return  ClassrommVoPageInfo;
    }



    @PostMapping("/addClassroom")
    public AjaxResponse addClassroom(@RequestBody @Valid ClassroomVo classroomVo) {
        log.debug(classroomVo.toString() + "=================");
        classroomService.addClassroom(classroomVo);
        return AjaxResponse.success(classroomVo);
    }

    @PutMapping("/updateClassroom")
    public AjaxResponse updateClassroom(@RequestBody @Valid ClassroomVo classroomVo) {
        log.debug("修改企业档案信息");
        classroomVo.setUpdatetime(new Date());
        //获取当前时间
        classroomService.updateClassroom(classroomVo);
        return AjaxResponse.success(classroomVo);
    }


    @PutMapping("/deleteClassroom")
    public String deleteClassroom(@RequestBody @Valid ClassroomVo classroomVo){
        classroomService.deleteClassroom(classroomVo.getClassroomId());
        return "删除成功";
    }

    @GetMapping("/classroomName")
    public PageInfo<Classroom> classroomName(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam("classroomName") String classroomName) {
        PageHelper.startPage(currentPage, pagesize);
        List<Classroom> classname = classroomService.selectClassroom(classroomName);
        PageInfo<Classroom> ClassPageInfo = new PageInfo<>(classname);
        return ClassPageInfo;
    }

}
