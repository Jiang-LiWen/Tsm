package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.DeptService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.DeptVo;
import com.trkj.tsm.vo.PositionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("/selectDeptlike")
    public PageInfo<DeptVo> selectDeptlike(@RequestParam("currentPage") int currentPage,
                                            @RequestParam("pagesize") int pagesize,
                                            @RequestParam("sech") String likeke){
        log.debug("分页查询信息");
        String likekes="%"+likeke+"%";
        log.debug("---------------------------------------------------");
        List<DeptVo> entityPage =deptService.selectDeptlike(likekes);
        PageHelper.startPage(currentPage,pagesize);
        PageInfo<DeptVo> deptVoPageInfo = new  PageInfo<>(entityPage);
        return deptVoPageInfo;
    }
    @GetMapping("/selectDept")
    public PageInfo<DeptVo> selectDept(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询部门");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<DeptVo> entityPage =deptService.selectDept();
        PageInfo<DeptVo> deptVoPageInfo = new  PageInfo<>(entityPage);
        return deptVoPageInfo;
    }
    //新增操作
    @PostMapping("/addDept")
    public AjaxResponse addDept(@RequestBody @Valid DeptVo deptVo){

        log.debug("新增年届信息");
        deptService.insert(deptVo);
        return AjaxResponse.success(deptVo);
    }
    //删除操作
    @DeleteMapping("/deleteDept/{deptId}")
    public String deleteDept(@PathVariable("deptId") int deptId){
        log.debug("根据id删除职位信息");
        deptService.deleteByPrimaryKey(deptId);
        return "删除成功";
    }
    //批量删除
    @PutMapping("/updateDeptTimeliness")
    public AjaxResponse updateDeptTimeliness(@RequestBody @Valid DeptVo deptVo){
        log.debug("批量删除职位信息");
        deptVo.setDeletetime(new Date());
        deptService.updateDeptTimeliness(deptVo);
        return AjaxResponse.success(deptVo);
    }
    //修改操作
    @PutMapping("/updateDept")
    public AjaxResponse updateDept(@RequestBody @Valid DeptVo deptVo){
        log.debug("修改年届信息");
        deptVo.setUpdatetime(new Date());
        deptService.updateByPrimaryKey(deptVo);
        return AjaxResponse.success(deptVo);
    }
    @GetMapping("/selectDepts")
    public List<DeptVo> selectDepts(){
        return deptService.selectDepts();
    }
}
