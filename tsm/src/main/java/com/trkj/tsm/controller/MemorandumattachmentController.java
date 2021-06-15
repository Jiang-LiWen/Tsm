package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.MemorandumattachmentService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.AnnouncementVo;
import com.trkj.tsm.vo.MemorandumattachmentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class MemorandumattachmentController {
    @Autowired
    private MemorandumattachmentService memorandumattachmentService;
    //    招生未审核显示
    @GetMapping("/selectZSIsExamine")
    public PageInfo<MemorandumattachmentVo> selectZSIsExamine(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<MemorandumattachmentVo> MemorandumattachmentPage = memorandumattachmentService.selectZSIsExamine();
        PageInfo<MemorandumattachmentVo> MemorandumattachmentPageInfo = new PageInfo<>(MemorandumattachmentPage);
        return MemorandumattachmentPageInfo;
    }
    //    教务未审核显示
    @GetMapping("/selectJWIsExamine")
    public PageInfo<MemorandumattachmentVo> selectJWIsExamine(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<MemorandumattachmentVo> WIsExaminePage = memorandumattachmentService.selectJWIsExamine();
        PageInfo<MemorandumattachmentVo> WIsExaminePageInfo = new PageInfo<>(WIsExaminePage);
        return WIsExaminePageInfo;
    }
    //    招生已审核审核显示
    @GetMapping("/selectZSIsExamineOver")
    public PageInfo<MemorandumattachmentVo> selectZSIsExamineOver(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<MemorandumattachmentVo> MemorandumattachmentPage = memorandumattachmentService.selectZSIsExamineOver();
        PageInfo<MemorandumattachmentVo> MemorandumattachmentPageInfo = new PageInfo<>(MemorandumattachmentPage);
        return MemorandumattachmentPageInfo;
    }
    //    教务已审核审核显示
    @GetMapping("/selectJWIsExamineOver")
    public PageInfo<MemorandumattachmentVo> selectJWIsExamineOver(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<MemorandumattachmentVo> WIsExaminePage = memorandumattachmentService.selectJWIsExamineOver();
        PageInfo<MemorandumattachmentVo> WIsExaminePageInfo = new PageInfo<>(WIsExaminePage);
        return WIsExaminePageInfo;
    }
    //    显示
    @GetMapping("/selectMemorandumattachment")
    public PageInfo<MemorandumattachmentVo> selectMemorandumattachment(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<MemorandumattachmentVo> MemorandumattachmentPage = memorandumattachmentService.selectMemorandumattachment();
        PageInfo<MemorandumattachmentVo> MemorandumattachmentPageInfo = new PageInfo<>(MemorandumattachmentPage);
        return MemorandumattachmentPageInfo;
    }
    //    招生审核
    @PutMapping("/updateByZSIsExamine")
    public AjaxResponse updateByZSIsExamine(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        log.debug("招生审核通过======================Controller");
        memorandumattachmentVo.setZsexaminetime(new Date());
        memorandumattachmentService.updateByZSIsExamine(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
    //    教务审核
    @PutMapping("/updateByJWIsExamine")
    public AjaxResponse updateByJWIsExamine(@RequestBody @Valid MemorandumattachmentVo memorandumattachmentVo){
        log.debug("教务审核通过======================Controller");
        memorandumattachmentVo.setJwexaminetime(new Date());
        memorandumattachmentService.updateByJWIsExamine(memorandumattachmentVo);
        return AjaxResponse.success(memorandumattachmentVo);
    }
}
