package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Studentstatus;
import com.trkj.tsm.service.StudentstatusService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.StudentstatusVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class StudentstatusController {
    @Autowired
    private StudentstatusService studentstatusService;

    @GetMapping("/selectStudentstatusLike")
    public PageInfo<StudentstatusVo> selectStudentstatusLike(@RequestParam("currentPage") int currentPage,
                                                             @RequestParam("pagesize") int pagesize,
                                                             @RequestParam("sech1") String likeke1,
                                                             @RequestParam("sech2") String likeke2){
        log.debug("分页查询信息---------------------------------------------------");
        String likekes1="%"+likeke1+"%";
        String likekes2="%"+likeke2+"%";
        PageHelper.startPage(currentPage,pagesize);
        List<StudentstatusVo> entityPage =studentstatusService.selectStudentstatusLike(likekes1,likekes2);
        PageInfo<StudentstatusVo> studentstatusVoPageInfo = new  PageInfo<>(entityPage);
        return studentstatusVoPageInfo;
    }

    @GetMapping("/selectStudentstatusId/{studentid}")
    public Studentstatus selectStudentstatusId(@PathVariable("studentid") int studentid){
        Studentstatus entity =studentstatusService.selectStudentstatusId(studentid);
        return entity;
    }

    @PutMapping("/updateStudentstatus")
    public AjaxResponse updateStudentstatus(@RequestBody @Valid StudentstatusVo studentstatusVo){

        log.debug("修改学员---------------------------------------------------");
        studentstatusService.updateStudentstatus(studentstatusVo);
        return AjaxResponse.success(studentstatusVo);
    }

    @PutMapping("/deleteStudentstatus")
    public AjaxResponse deleteStudentstatus(@RequestBody @Valid StudentstatusVo studentstatusVo){
        studentstatusVo.setDeletetime(new Date());
        log.debug("删除学员---------------------------------------------------");
        studentstatusService.deleteStudentstatus(studentstatusVo);
        return AjaxResponse.success(studentstatusVo);
    }

}
