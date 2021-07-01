package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.RegisterService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.AnnouncementVo;
import com.trkj.tsm.vo.RegisterVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    //    显示
    @GetMapping("/selectRegisterAll")
    public PageInfo<RegisterVo> selectRegisterAll(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<RegisterVo> registerPage = registerService.selectRegisterAll();
        PageInfo<RegisterVo> registerPageInfo = new PageInfo<>(registerPage);
        return registerPageInfo;
    }
//    增加咨询登记
    @PostMapping("/addRegister")
    public AjaxResponse addRegister(@RequestBody @Valid RegisterVo registerVo){
        log.debug("添加成功");
        log.debug(registerVo.toString());
        registerService.insertRegister(registerVo);
        return AjaxResponse.success("添加咨询信息成功");
    }
    //    删除
    @PutMapping("/updateRegisterTimeLiness")
    public AjaxResponse updateRegisterTimeLiness(@RequestBody @Valid RegisterVo registerVo){
        registerVo.setDeletetime(new Date());
        log.debug("删除成功");
        registerService.updateRegisterTimeLiness(registerVo);
        return AjaxResponse.success(registerVo);
    }
    //    修改
    @PutMapping("/updateRegister")
    public RegisterVo updateRegister(@RequestBody RegisterVo registerVo){
        log.debug("开始修改");
        log.debug(registerVo.getAttentstate().toString()+"==========================================================");
        registerVo.setLastupdatetime(new Date());
        log.debug(registerVo.toString());
        return registerService.updateRegister(registerVo);
    }
    //    生源渠道名称条件查询
    @GetMapping("/selectRegisterSource")
    public PageInfo<RegisterVo> selectRegisterSource(@RequestParam("input3") String input3, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<RegisterVo> findSourcePage = registerService.selectRegisterSource(input3);
        PageInfo<RegisterVo> findSourcePageInfo = new PageInfo<>(findSourcePage);
        return findSourcePageInfo;
    }
    //    课程名称名称条件查询
    @GetMapping("/selectRegisterCourse")
    public PageInfo<RegisterVo> selectRegisterCourse(@RequestParam("input3") String courseName, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<RegisterVo> findCoursePage = registerService.selectRegisterCourse(courseName);
        PageInfo<RegisterVo> findCoursePageInfo = new PageInfo<>(findCoursePage);
        return findCoursePageInfo;
    }
    //    职工名称条件查询
    @GetMapping("/selectRegisterEmp")
    public PageInfo<RegisterVo> selectRegisterEmp(@RequestParam("input3") String empName, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<RegisterVo> findEmpPage = registerService.selectRegisterEmp(empName);
        PageInfo<RegisterVo> findEmpPageInfo = new PageInfo<>(findEmpPage);
        return findEmpPageInfo;
    }
    //    咨询人电话条件查询
    @GetMapping("/selectRegisterPhone")
    public PageInfo<RegisterVo> selectRegisterPhone(@RequestParam("input3") String phone, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<RegisterVo> findPhonePage = registerService.selectRegisterPhone(phone);
        PageInfo<RegisterVo> findPhonePageInfo = new PageInfo<>(findPhonePage);
        return findPhonePageInfo;
    }
    //    咨询人名称条件查询
    @GetMapping("/selectRegisterConsultAnt")
    public PageInfo<RegisterVo> selectRegisterConsultAnt(@RequestParam("input3") String consultantName, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<RegisterVo> findConsultAntPage = registerService.selectRegisterConsultAnt(consultantName);
        PageInfo<RegisterVo> findConsultAntPageInfo = new PageInfo<>(findConsultAntPage);
        return findConsultAntPageInfo;
    }
    //    咨询内容称条件查询
    @GetMapping("/selectRegisterConsultContent")
    public PageInfo<RegisterVo> selectRegisterConsultContent(@RequestParam("input3") String consultcontent, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<RegisterVo> findConsultContentPage = registerService.selectRegisterConsultContent(consultcontent);
        PageInfo<RegisterVo> findConsultContentPageInfo = new PageInfo<>(findConsultContentPage);
        return findConsultContentPageInfo;
    }
}
