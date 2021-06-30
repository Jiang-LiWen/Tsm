package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.ShiftService;
import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.ShiftVo;
import com.trkj.tsm.vo.SuspendeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class ShiftController {
    @Autowired
    private ShiftService shiftService;
    //    模糊查询以及显示
    @GetMapping("/selectShStudentNameLike")
    public PageInfo<ShiftVo> selectShStudentNameLike(@RequestParam("currentPage") int currentPage,
                                                     @RequestParam("pagesize") int pagesize,
                                                     @RequestParam("studentname") String studentname){
        log.debug("分页查询学生姓名信息------------------Controllrt");
        PageHelper.startPage(currentPage,pagesize);
        List<ShiftVo> findSuspendePage = shiftService.selectStudentNameLike(studentname);
        PageInfo<ShiftVo> findSuspendePageInfo = new PageInfo<>(findSuspendePage);
        return findSuspendePageInfo;
    }
    //    下拉选择状态显示
//    @GetMapping("/selectClassesOpen")
//    public PageInfo<ShiftVo> selectClassesOpen(@RequestParam("currentPage") int currentPage,
//                                                     @RequestParam("pagesize") int pagesize,
//                                                     @RequestParam("classesOpen") String classesOpen){
//        log.debug("分页查询开班状态信息------------------Controllrt");
//        log.debug(classesOpen+"===============Controller");
//        PageHelper.startPage(currentPage,pagesize);
//        List<ShiftVo> findSuspendePage = shiftService.selectClassesOpen(classesOpen);
//        PageInfo<ShiftVo> findSuspendePageInfo = new PageInfo<>(findSuspendePage);
//        return findSuspendePageInfo;
//    }
    //    删除（修改时效性）
    @PutMapping("/updataShiftTimeLinss")
    public ShiftVo updataShiftTimeLinss(@RequestBody ShiftVo shiftVo){
        log.debug("删除（修改时效性）---------------------Controllrt");
        return shiftService.updateShiftTimeLiness(shiftVo);
    }
    //    审批
    @PutMapping("/updateShiftApproval")
    public ShiftVo updateShiftApproval(@RequestBody ShiftVo shiftVo){
        log.debug("审批---------------------Controllrt");
        return shiftService.updateShiftApproval(shiftVo);
    }
//    增加
    @PostMapping("/insertShift")
    public ShiftVo insertShift(@RequestBody @Valid ShiftVo shiftVo){
        log.debug("添加--------------------Controllrt");
        shiftService.insertShift(shiftVo);
        return shiftVo;
    }
//    修改转班理由
    @PutMapping("/updateShift")
    public ShiftVo updateSuspende(@RequestBody ShiftVo shiftVo){
        log.debug("修改退学理由--------------------Controllrt");
        return shiftService.updataShift(shiftVo);
    }
}
