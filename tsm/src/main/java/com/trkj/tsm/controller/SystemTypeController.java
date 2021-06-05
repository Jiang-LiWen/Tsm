package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Systemtype;
import com.trkj.tsm.service.SystemTypeService;
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
public class SystemTypeController {

    @Resource
    private SystemTypeService systemTypeService;

    @GetMapping("/selectAlls2")
    public PageInfo<Systemtype> selectAlls2(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
        PageHelper.startPage(currentPage, pagesize);
        log.debug("--------------------");
        List<Systemtype> entityPage = systemTypeService.selectAlls2();
        PageInfo<Systemtype> SystemtypePageInfo = new PageInfo<>(entityPage);
        return SystemtypePageInfo;
    }
    @GetMapping("/selectAlls9")
    public List<Systemtype> selectAlls9() {
        return systemTypeService.selectAlls9();
    }

    @PostMapping("/addSysyemtype")
    public AjaxResponse addSysyemtype(@RequestBody @Valid Systemtype Systemtype) {
        log.debug(Systemtype.toString() + "=================");
        systemTypeService.addSysyemtype(Systemtype);
        return AjaxResponse.success(Systemtype);
    }

    @PutMapping("/updateSysyemtype")
    public AjaxResponse updateSysyemtype(@RequestBody @Valid Systemtype systemtype) {
        log.debug("修改信息");
        systemtype.setUpdatetime(new Date());
        //获取当前时间
        systemTypeService.updateSysyemtype(systemtype);
        return AjaxResponse.success(systemtype);
    }

    @GetMapping("/systemtypeName")
    public PageInfo<Systemtype> systemtypeName(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam("systemtypeName") String systemtypeName) {
        PageHelper.startPage(currentPage, pagesize);
        List<Systemtype> sysname = systemTypeService.selectSysyemtype(systemtypeName);
        PageInfo<Systemtype> SysnamePageInfo = new PageInfo<>(sysname);
        return SysnamePageInfo;
    }

    @PutMapping("/deleteSystemType")
    public String deleteSystemType(@RequestBody @Valid Systemtype systemtype){
        systemTypeService.deleteSystemType(systemtype.getSystemtypeId());
        return "删除成功";
    }
}
