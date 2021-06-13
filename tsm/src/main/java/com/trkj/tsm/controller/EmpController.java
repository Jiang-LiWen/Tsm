package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.EmpService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.DeptVo;
import com.trkj.tsm.vo.EmpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/ClassesselectEmp1")
    public List<EmpVo> ClassesselectEmp1(){
        log.debug("班级找班主任---------------------------------------------------");
        List<EmpVo> entityPage =empService.ClassesselectEmp1();
        return entityPage;
    }

    @GetMapping("/ClassesselectEmp2")
    public List<EmpVo> selectEmp(){
        log.debug("班级找教员---------------------------------------------------");
        List<EmpVo> entityPage =empService.ClassesselectEmp2();
        return entityPage;
    }

    @GetMapping("/selectEmplike")
    public PageInfo<EmpVo> selectDeptlike(@RequestParam("currentPage") int currentPage,
                                          @RequestParam("pagesize") int pagesize,
                                          @RequestParam("sech") String likeke){
        log.debug("分页查询信息");
        String likekes="%"+likeke+"%";
        log.debug("---------------------------------------------------");
        List<EmpVo> entityPage =empService.selectEmpLike(likekes);
        PageHelper.startPage(currentPage,pagesize);
        PageInfo<EmpVo> empVoPageInfo = new  PageInfo<>(entityPage);
        return empVoPageInfo;
    }
    @GetMapping("/selectEmp")
    public PageInfo<EmpVo> selectEmp(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询部门");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<EmpVo> entityPage =empService.selectEmp();
        PageInfo<EmpVo> empVoPageInfo = new  PageInfo<>(entityPage);
        return empVoPageInfo;
    }
    //新增操作
    @PostMapping("/addEmp")
    public AjaxResponse addEmp(@RequestBody @Valid EmpVo empVo){

        log.debug("新增年届信息");
        empVo.setAddname("wenshao");
        empService.insert(empVo);
        return AjaxResponse.success(empVo);
    }
    //删除操作
    @DeleteMapping("/deleteEmp/{empId}")
    public String deleteEmp(@PathVariable("empId") int empId){
        log.debug("根据id删除职位信息");
        empService.deleteByPrimaryKey(empId);
        return "删除成功";
    }
    //批量删除
    @PutMapping("/updateEmpTimeliness")
    public AjaxResponse updateEmpTimeliness(@RequestBody @Valid EmpVo empVo){
        log.debug("批量删除职位信息");
        empVo.setDeletetime(new Date());
        empService.updateEmpTimeliness(empVo);
        return AjaxResponse.success(empVo);
    }
    //修改操作
    @PutMapping("/updateEmp")
    public AjaxResponse updateEmp(@RequestBody @Valid EmpVo empVo){
        log.debug("修改年届信息");
        empVo.setUpdatetime(new Date());
        empService.updateByPrimaryKey(empVo);
        return AjaxResponse.success(empVo);
    }
}
