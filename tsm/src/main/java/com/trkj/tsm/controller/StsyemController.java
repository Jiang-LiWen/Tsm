package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.SystSevice;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.SystemVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
public class StsyemController {
    @Autowired
    private SystSevice systSevice;

    @GetMapping("/selectAllSystem")
    public PageInfo<SystemVo> selectAllSystem(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize) {
        PageHelper.startPage(currentPage, pagesize);
        log.debug("--------------------");
        List<SystemVo> entityPage = systSevice.selectAllSystem();
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
}
