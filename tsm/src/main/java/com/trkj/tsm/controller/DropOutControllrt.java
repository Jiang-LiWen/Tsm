package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.DropOutService;
import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.PositionVo;
import com.trkj.tsm.vo.RegisterVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
@RestController
@Slf4j
public class DropOutControllrt {
    @Autowired
    private DropOutService dropOutService;
//    模糊查询以及显示
    @GetMapping("/selectStudentNameLike")
    public PageInfo<DropoutVo> selectStudentNameLike(@RequestParam("currentPage") int currentPage,
                                                @RequestParam("pagesize") int pagesize,
                                                @RequestParam("studentname") String studentname){
        log.debug("分页查询学生姓名信息------------------Controllrt");
        PageHelper.startPage(currentPage,pagesize);
        List<DropoutVo> finddropoutPage = dropOutService.selectStudentNameLike(studentname);
        PageInfo<DropoutVo> finddropoutPageInfo = new PageInfo<>(finddropoutPage);
        return finddropoutPageInfo;
    }
//    修改退学理由
    @PutMapping("/updateDropOut")
    public DropoutVo updateDropOut(@RequestBody DropoutVo dropoutVo){
        log.debug("修改退学理由--------------------Controllrt");
        return dropOutService.updateDropOut(dropoutVo);
    }
//    删除（修改时效性）
    @PutMapping("/updataDropOutTimeLinss")
    public DropoutVo updataDropOutTimeLinss(@RequestBody DropoutVo dropoutVo){
        log.debug("删除（修改时效性）---------------------Controllrt");
        dropoutVo.setDeletetime(new Date());
        return dropOutService.updateDropOutTimeLiness(dropoutVo);
    }
//    添加退学记录
    @PostMapping("/insertDropOut")
    public DropoutVo insertDropOut(@RequestBody @Valid DropoutVo dropoutVo){
        log.debug("添加--------------------Controllrt");
        log.debug(dropoutVo.toString()+"添加的信息在这里");
        dropOutService.insertDropOut(dropoutVo);
        return dropoutVo;
    }
    //    审批（修改时效性）
    @PutMapping("/updateDropOutDropoutStatus")
    public DropoutVo updateDropOutDropoutStatus(@RequestBody DropoutVo dropoutVo){
        log.debug("审批（修改状态）---------------------Controllrt");
        dropoutVo.setDropTime(new Date());
        return dropOutService.updateDropOutDropoutStatus(dropoutVo);
    }
//    取消退学（删除数据库表数据）
    @DeleteMapping("/delDropOutFrom")
    public int delDropOutFrom(@PathVariable("dropId") Integer dropId){
        log.debug("取消退学-------------------------Controllrt");
        return dropOutService.delRowFrom(dropId);
    }
}
