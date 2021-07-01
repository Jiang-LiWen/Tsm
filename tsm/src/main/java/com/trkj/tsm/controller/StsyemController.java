package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.SystSevice;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.ClassroomVo;
import com.trkj.tsm.vo.SystemVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class StsyemController {
    @Autowired
    private SystSevice systSevice;

    @GetMapping("/selectAllSystem")
    public PageInfo<SystemVo> selectAllSystem(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize ,@RequestParam("flag") String flag) {
        PageHelper.startPage(currentPage, pagesize);
        log.debug("--------------------");
        List<SystemVo> entityPage = systSevice.selectAllSystem(flag);
        PageInfo<SystemVo> SystemPageInfo = new PageInfo<>(entityPage);
        return SystemPageInfo;
    }

    @PostMapping("/addsSystem")
    public AjaxResponse addsSystem(@RequestBody @Valid SystemVo systemVo) {
        log.debug(systemVo+toString());
        log.debug(systemVo.toString() + "=================");
        systSevice.addsSystem(systemVo);
        return AjaxResponse.success(systemVo);
    }

    @PutMapping("/deleteSystem")
    public String deleteSystem(@RequestBody @Valid SystemVo systemVo){
        systSevice.deleteSystem(systemVo.getSystemId());
        return "删除成功";
    }
    @PutMapping("/updateByPrimaryKey1")
    public AjaxResponse updateByPrimaryKey1(@RequestBody @Valid SystemVo systemVo){
        systemVo.setDeletetime(new Date());
        log.debug("批量删除");
        systSevice.updateByPrimaryKey1(systemVo);
        return AjaxResponse.success(systemVo);
    }


    @PutMapping("/updateByPrimaryKeySelective1")
    public AjaxResponse updateStsyem(@RequestBody @Valid SystemVo systemVo) {
        log.debug("修改");
        systemVo.setUpdatetime(new Date());
        //获取当前时间
        systSevice.updateSysyem(systemVo);
        return AjaxResponse.success(systemVo);
    }

    @PutMapping("/updateByPrimaryKey2")
    public AjaxResponse updateByPrimaryKey2(@RequestBody @Valid SystemVo systemVo){
        systemVo.setPublishtime(new Date());
        log.debug("批量发布");
        systSevice.updateByPrimaryKey2(systemVo);
        return AjaxResponse.success(systemVo);
    }
    @PutMapping("/updateByPrimaryKey3")
    public AjaxResponse updateByPrimaryKey3(@RequestBody @Valid SystemVo systemVo){
        systemVo.setPublishtime(new Date());
        log.debug("批量发布");
        systSevice.updateByPrimaryKey3(systemVo);
        return AjaxResponse.success(systemVo);
    }
}
