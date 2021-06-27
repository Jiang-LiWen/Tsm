package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Classes;
import com.trkj.tsm.service.ClassesService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.ClassesVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class ClassesController {
    @Autowired
    private ClassesService classesService;

    @GetMapping("/selectClassesBycid")
    public Classes selectClassesBycid(@RequestParam("cid") int cid){
        log.debug("查询班级信息---------------------------------------------------");
        Classes entityPage =classesService.selectClassesBycid(cid);
        return entityPage;
    }

    @GetMapping("/selectAllClasses")
    public PageInfo<ClassesVo> selectAllClasses(@RequestParam("currentPage") int currentPage,
                                                @RequestParam("pagesize") int pagesize,
                                                @RequestParam("sech") String likeke){
        log.debug("分页查询信息---------------------------------------------------"+likeke);
        String likekes="%"+likeke+"%";
        PageHelper.startPage(currentPage,pagesize);
        List<ClassesVo> entityPage =classesService.selectAllClasses(likekes);
        PageInfo<ClassesVo> classesVoPageInfo = new  PageInfo<>(entityPage);
        return classesVoPageInfo;
    }

    @PutMapping("/updateClasses_Open")
    public AjaxResponse updateClasses_Open(@RequestBody @Valid ClassesVo classesVo){
        log.debug("开班修改---------------------------------------------------");
        classesService.updateClasses_Open(classesVo);
        return AjaxResponse.success(classesVo);
    }

    @PutMapping("/updateClasses_State")
    public AjaxResponse updateClasses_State(@RequestBody @Valid ClassesVo classesVo){
        log.debug("毕业修改---------------------------------------------------");
        classesService.updateClasses_State(classesVo);
        return AjaxResponse.success(classesVo);
    }

    @PutMapping("/updateClasses")
    public AjaxResponse updateClasses(@RequestBody @Valid ClassesVo classesVo){
        classesVo.setUpdatetime(new Date());
        log.debug("修改班级---------------------------------------------------");
        classesService.updateClasses(classesVo);
        return AjaxResponse.success(classesVo);
    }

    @PutMapping("/deleteClasses")
    public AjaxResponse deleteClasses(@RequestBody @Valid ClassesVo classesVo){
        classesVo.setDeletetime(new Date());
        log.debug("删除班级---------------------------------------------------");
        classesService.deleteClasses(classesVo);
        return AjaxResponse.success(classesVo);
    }

    @PostMapping("/insertClasses")
    public AjaxResponse insertCourse(@RequestBody @Valid ClassesVo classesVo){
        log.debug(classesVo.toString()+"=================");
        log.debug("新增课程信息");
        classesService.insertClasses(classesVo);
        return AjaxResponse.success(classesVo);
    }
}
