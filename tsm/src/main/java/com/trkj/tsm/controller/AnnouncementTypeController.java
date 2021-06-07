package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.FaqQuestions;
import com.trkj.tsm.service.AnnouncementTypeService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.AnnouncementtypeVo;
import com.trkj.tsm.vo.FaqQuestionsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class AnnouncementTypeController {
    @Autowired
    private AnnouncementTypeService announcementTypeService;
    @GetMapping("/selectAnnounceTypeAll")
    public PageInfo<AnnouncementtypeVo> selectAnnTypeAll(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<AnnouncementtypeVo> announTypePage = announcementTypeService.selectAnnTypeAll();
        PageInfo<AnnouncementtypeVo> AnnountypePageInfo = new PageInfo<>(announTypePage);
        return AnnountypePageInfo;
    }
    @GetMapping("/selectAnnounceTypeAll1")
    public List<AnnouncementtypeVo> selectAnnTypeAll1(){
        log.debug("Controller 方法调用");
        List<AnnouncementtypeVo> announTypePage = announcementTypeService.selectAnnTypeAll();
        return announTypePage;
    }
    @PostMapping("/addAnnounceType")
    public AnnouncementtypeVo addAnnounceType(@RequestBody @Valid AnnouncementtypeVo announcementtypeVo){
        log.debug("添加成功");
        log.debug(announcementtypeVo.toString());
        announcementTypeService.addAnnounceType(announcementtypeVo);
        return announcementtypeVo;
    }
    @PutMapping("/updateAnnounceType")
    public AnnouncementtypeVo updateAnnounceType(@RequestBody AnnouncementtypeVo announcementtypeVo){
        log.debug("开始修改");
        log.debug(announcementtypeVo.toString());
        announcementtypeVo=announcementTypeService.updateAnnounceType(announcementtypeVo);
        return announcementtypeVo;
    }
    @PutMapping("/updateAnnounceTypeTimeLiness")
    public AjaxResponse updateAnnounceTypeTimeLiness(@RequestBody @Valid AnnouncementtypeVo announcementtypeVo){
        announcementtypeVo.setDeletetime(new Date());
        log.debug("删除成功");
        announcementTypeService.updateAnnounceTypeTimeLiness(announcementtypeVo);
        return AjaxResponse.success(announcementtypeVo);
    }
}
