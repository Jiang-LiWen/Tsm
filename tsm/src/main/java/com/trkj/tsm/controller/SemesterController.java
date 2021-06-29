package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.SemesterService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.SemesterVo;
import com.trkj.tsm.vo.SessionVo;
import com.trkj.tsm.vo.UnittypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class SemesterController {
    @Autowired
    private SemesterService semesterService;
    //分页查询
    @GetMapping("/selectSemester")
    public PageInfo<SemesterVo> selectSemester(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询学期");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<SemesterVo> entityPage =semesterService.selectSemester();
        PageInfo<SemesterVo> semesterVoPageInfo = new  PageInfo<>(entityPage);
        return semesterVoPageInfo;
    }
    //新增操作
    @PostMapping("/addSemester")
    public AjaxResponse addSemester(@RequestBody @Valid SemesterVo semesterVo){

        log.debug("新增xueq信息");
        semesterVo.setAddname("wenwen");
        semesterService.insert(semesterVo);
        return AjaxResponse.success(semesterVo);
    }
    //删除操作
    @DeleteMapping("/deleteSemester")
    public String deleteSemester(@RequestParam("semesterId") int semesterId){
        log.debug("根据id删除单位类型信息");
        semesterService.deleteByPrimaryKey(semesterId);
        return "删除成功";
    }
    //修改操作
    @PutMapping("/updateSemester")
    public AjaxResponse updateSemester(@RequestBody @Valid SemesterVo semesterVo){
        log.debug("修改学期信息");
        semesterVo.setUpdatename("wen");
        semesterVo.setUpdatetime(new Date());
        semesterService.updateByPrimaryKey(semesterVo);
        return AjaxResponse.success(semesterVo);
    }
    //根据id进行重新
    @GetMapping("/selectSemesterId/{semesterId}")
    public String selectUnittypeId(@PathVariable("semesterId") int semesterId){
        log.debug("根据id查询单位类型信息");
        semesterService.selectByPrimaryKey(semesterId);
        return "查询成功";
    }
    @GetMapping("/selectSemesterlike")
    public PageInfo<SemesterVo> selectfindslike(@RequestParam("currentPage") int currentPage,
                                               @RequestParam("pagesize") int pagesize,
                                               @RequestParam("sech") String likeke){
        log.debug("分页查询信息");
        String likekes="%"+likeke+"%";
        log.debug("---------------------------------------------------");
        List<SemesterVo> entityPage =semesterService.selectfindslike(likekes);
        PageHelper.startPage(currentPage,pagesize);
        log.debug(entityPage.size()+"");
        PageInfo<SemesterVo> semesterVoPageInfo = new  PageInfo<>(entityPage);
        return semesterVoPageInfo;
    }
}
