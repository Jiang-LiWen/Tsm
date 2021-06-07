package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.ClasstypeService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.ClasstypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class ClasstypeController {
    @Autowired
    private ClasstypeService classtypeService;

    @GetMapping("/selectClasstypeslike")
    public PageInfo<ClasstypeVo> selectfindslike(@RequestParam("currentPage") int currentPage,
                                                 @RequestParam("pagesize") int pagesize,
                                                 @RequestParam("sech") String likeke){
        log.debug("分页查询信息");
        String likekes="%"+likeke+"%";

        log.debug("---------------------------------------------------");
        List<ClasstypeVo> entityPage =classtypeService.selectfindslike(likekes);
        PageHelper.startPage(currentPage,pagesize);
        log.debug(entityPage.size()+"");
        PageInfo<ClasstypeVo> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    @GetMapping("/selectClasstype")
    public List<ClasstypeVo> selectfind(){
        log.debug("查询信息");
        log.debug("---------------------------------------------------");
        List<ClasstypeVo> entityPage =classtypeService.selectfinds();

        return entityPage;
    }

    @GetMapping("/selectClasstypes")
    public PageInfo<ClasstypeVo> selectfinds(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询信息");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<ClasstypeVo> entityPage =classtypeService.selectfinds();
        PageInfo<ClasstypeVo> classtypeVoPageInfo = new  PageInfo<>(entityPage);
        return classtypeVoPageInfo;
    }

    @PostMapping("/addclasstype")
    public AjaxResponse addClasstype(@RequestBody @Valid ClasstypeVo classtypevo){
        log.debug(classtypevo.toString()+"=================");
        log.debug("新增课程类别信息");
        classtypeService.addClasstype(classtypevo);
        return AjaxResponse.success(classtypevo);
    }

    @PutMapping("/updclasstype")
    public AjaxResponse updateClasstype(@RequestBody @Valid ClasstypeVo classtypeVo){
        classtypeVo.setDeletetime(new Date());
        log.debug("修改课程类别信息");
        classtypeService.updateClasstype(classtypeVo);
        return AjaxResponse.success(classtypeVo);
    }
}
