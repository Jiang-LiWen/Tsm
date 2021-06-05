package com.trkj.tsmvueboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsmvueboot.service.AnnouncementService;
import com.trkj.tsmvueboot.vo.AjaxResponse;
import com.trkj.tsmvueboot.vo.AnnouncementVo;
import com.trkj.tsmvueboot.vo.AnnouncementtypeVo;
import com.trkj.tsmvueboot.vo.FaqQuestionsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
//import java.sql.Date;
import java.util.List;

@RestController
@Slf4j
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;
//    显示
    @GetMapping("/selectAnnounceManageAll")
    public PageInfo<AnnouncementVo> selectAnnounceManageAll(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<AnnouncementVo> announManagePage = announcementService.selectAnnounceManageAll();
        PageInfo<AnnouncementVo> announManagePageInfo = new PageInfo<>(announManagePage);
        return announManagePageInfo;
    }
//    添加
    @PostMapping("/addAnnounceManage")
    public AnnouncementVo addAnnounceManage(@RequestBody @Valid AnnouncementVo announcementVo){
        log.debug("添加成功");
        log.debug(announcementVo.toString());
        announcementService.addAnnounceMenage(announcementVo);
        return announcementVo;
    }
//    发布
    @PutMapping("/updateAnnounceManageStat")
    public AjaxResponse updateAnnounceManageStat(@RequestBody @Valid AnnouncementVo announcementVo){
        log.debug("发布成功");
        announcementVo.setPublishtime(new Date());
        announcementService.updateAnnounceManageStat(announcementVo);
        return AjaxResponse.success(announcementVo);
    }
    //    暂停
    @PutMapping("/updateAnnounceManageStat2")
    public AjaxResponse updateAnnounceManageStat2(@RequestBody @Valid AnnouncementVo announcementVo){
        log.debug("暂停成功");
        announcementVo.setSuspendtime(new Date());
        announcementService.updateAnnounceManageStat2(announcementVo);
        return AjaxResponse.success(announcementVo);
    }
//    删除
    @PutMapping("/updateAnnounceManageTimeLiness")
    public AjaxResponse updateAnnounceManageTimeLiness(@RequestBody @Valid AnnouncementVo announcementVo){
        announcementVo.setDeletetime(new Date());
        log.debug("删除成功");
        announcementService.updateAnnounceManageTimeLiness(announcementVo);
        return AjaxResponse.success(announcementVo);
    }
//    修改
    @PutMapping("/updateAnnounceManage")
    public AnnouncementVo updateAnnounceManage(@RequestBody AnnouncementVo announcementVo){
        log.debug("开始修改");
        announcementVo.setUpdatetime(new Date());
        log.debug(announcementVo.toString());
        return announcementService.updateAnnounceManage(announcementVo);
    }
//    查询
    @GetMapping("/selectfindByContent")
    public PageInfo<AnnouncementVo> selectfindByContent(@RequestParam("announcementContent") String announcementContent, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<AnnouncementVo> findContentPage = announcementService.selectfindByContent(announcementContent);
        PageInfo<AnnouncementVo> findContentPageInfo = new PageInfo<>(findContentPage);
        return findContentPageInfo;
    }
}
