package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.BackService;
import com.trkj.tsm.vo.BackVo;
import com.trkj.tsm.vo.DropoutVo;
import com.trkj.tsm.vo.SuspendeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class BackController {
    @Autowired
    private BackService backService;
//    根据学生姓名模糊查询并显示
    @GetMapping("/selectLikeStudentName")
    public PageInfo<BackVo> selectSuStudentNameLike(@RequestParam("currentPage") int currentPage,
                                                    @RequestParam("pagesize") int pagesize,
                                                    @RequestParam("studentname") String studentname){
        log.debug("分页查询学生姓名信息------------------Controllrt");
        PageHelper.startPage(currentPage,pagesize);
        List<BackVo> findBackPage = backService.selectLikeStudentName(studentname);
        PageInfo<BackVo> findBackPageInfo = new PageInfo<>(findBackPage);
        return findBackPageInfo;
    }
//    删除修改时效性
    @PutMapping("/updateBackTimeLiness")
    public BackVo updateBackTimeLiness(@RequestBody @Valid BackVo backVo){
        log.debug("删除（修改时效性）---------------------Controllrt");
        backVo.setDeletetime(new Date());
        return backService.updateBackTimeLiness(backVo);
    }
//    修改
    @PutMapping("/updateBack")
    public BackVo updateBack(@RequestBody @Valid BackVo backVo){
        log.debug("修改---------------------Controllrt");
        return backService.updateBack(backVo);
    }
    //    删除修改时效性
    @PutMapping("/updateBackApproval")
    public BackVo updateBackApproval(@RequestBody @Valid BackVo backVo){
        log.debug("删除（修改时效性）---------------------Controllrt");
        backVo.setBackTime(new Date());
        backVo.setSuspendeHandler("dsb");
        return backService.updateBackApproval(backVo);
    }
//    取消复课
    @DeleteMapping("/delRowFrom/{backId}")
    public int delRowFrom(@PathVariable("backId") Integer backId){
        log.debug("取消退学-------------------------Controllrt");
        return backService.delRowFrom(backId);
    }
//    增加复课
    @PostMapping("/insertBack")
    public BackVo insertBack(@RequestBody @Valid BackVo backVo){
        log.debug(backVo.toString()+"========================-----------");
        log.debug("添加--------------------Controllrt");
        log.debug(backService.toString()+"添加的信息在这里");
        backService.insertBack(backVo);
        return backVo;
    }
}
