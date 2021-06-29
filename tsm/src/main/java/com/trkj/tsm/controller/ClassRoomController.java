package com.trkj.tsm.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Classroom;
import com.trkj.tsm.entity.Systemtype;
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
    public PageInfo<Classroom> selectAllSources(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam("flag") String flag){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("--------------------");
        List<Classroom> entityPage=classroomService.selectAlls(flag);
        PageInfo<Classroom> ClassrommVoPageInfo=new PageInfo<>(entityPage);
        log.debug(ClassrommVoPageInfo.toString());
        return  ClassrommVoPageInfo;
    }

    //显示教室表的全部内容
    @GetMapping("/selectAllsClassRoom")
    public List<Classroom> selectAllsClassRoom(){
        log.debug("ClassroomController:查找所有未过期的教室信息-----------------------------------------");
        List<Classroom> entityPage=classroomService.selectAllsClassRoom();
        return  entityPage;
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


    @PutMapping("/updateByPrimaryKey")
    public AjaxResponse updateByPrimaryKey(@RequestBody @Valid ClassroomVo classroomVo){
        classroomVo.setDeletetime(new Date());
        log.debug("删除");
        classroomService.updateByPrimaryKey(classroomVo);
        return AjaxResponse.success(classroomVo);
    }

}
