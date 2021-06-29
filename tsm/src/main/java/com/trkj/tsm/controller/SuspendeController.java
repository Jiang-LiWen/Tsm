package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.SuspendeService;
import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.SuspendeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class SuspendeController {
    @Autowired
    private SuspendeService suspendeService;
    //    模糊查询以及显示
    @GetMapping("/selectSuStudentNameLike")
    public PageInfo<SuspendeVo> selectSuStudentNameLike(@RequestParam("currentPage") int currentPage,
                                                      @RequestParam("pagesize") int pagesize,
                                                      @RequestParam("studentname") String studentname){
        log.debug("分页查询学生姓名信息------------------Controllrt");
        PageHelper.startPage(currentPage,pagesize);
        List<SuspendeVo> findSuspendePage = suspendeService.selectStudentNameLike(studentname);
        PageInfo<SuspendeVo> findSuspendePageInfo = new PageInfo<>(findSuspendePage);
        return findSuspendePageInfo;
    }
    //    修改停课理由
    @PutMapping("/updateSuspende")
    public SuspendeVo updateSuspende(@RequestBody SuspendeVo suspendeVo){
        log.debug("修改退学理由--------------------Controllrt");
        return suspendeService.updateSuspen(suspendeVo);
    }
    //    删除（修改时效性）
    @PutMapping("/updataSuspendeTimeLinss")
    public SuspendeVo updataSuspendeTimeLinss(@RequestBody SuspendeVo suspendeVo){
        log.debug("删除（修改时效性）---------------------Controllrt");
        suspendeVo.setDeletetime(new Date());
        return suspendeService.updateSuspendeTimeLiness(suspendeVo);
    }
    //    审批（修改时效性）
    @PutMapping("/updateSuspendeStatus")
    public SuspendeVo updateSuspendeStatus(@RequestBody SuspendeVo suspendeVo){
        log.debug("审批（修改状态）---------------------Controllrt");
        suspendeVo.setSuspendeTime(new Date());
        return suspendeService.updateSuspenStatus(suspendeVo);
    }
    //    取消退学（删除数据库表数据）
    @DeleteMapping("/delSuspendeFrom/{suspendeId}")
    public int delSuspendeFrom(@PathVariable("suspendeId") Integer suspendeId){
        log.debug("取消退学-------------------------Controllrt");
        return suspendeService.delRowFrom(suspendeId);
    }
}
