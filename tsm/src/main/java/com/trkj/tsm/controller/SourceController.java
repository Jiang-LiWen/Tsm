package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.SourceService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.AnnouncementVo;
import com.trkj.tsm.vo.AnnouncementtypeVo;
import com.trkj.tsm.vo.SourceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class SourceController {
    @Autowired
    private SourceService sourceService;
//    显示所有
    @GetMapping("/selectfindSourceAll")
    public PageInfo<SourceVo> selectfindSourceAll(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<SourceVo> SourcePage = sourceService.selectfindSourceAll();
        PageInfo<SourceVo> SourcePageInfo = new PageInfo<>(SourcePage);
        return SourcePageInfo;
    }
    //    显示所有
    @GetMapping("/selectfindSourceAll1")
    public List<SourceVo> selectfindSourceAll(){
        log.debug("Controller 方法调用");
        List<SourceVo> SourcePage = sourceService.selectfindSourceAll();
        return SourcePage;
    }
//    添加生源渠道信息
    @PostMapping("/insertSource")
    public SourceVo insertSource(@RequestBody @Valid SourceVo sourceVo){
        log.debug("添加成功");
        log.debug(sourceVo.toString());
        sourceService.insertSource(sourceVo);
        return sourceVo;
    }
//    修改生源渠道名称
    @PutMapping("/updateSource")
    public SourceVo updateSource(@RequestBody SourceVo sourceVo){
        log.debug("开始修改");
        log.debug(sourceVo.toString());
        sourceVo=sourceService.updateSource(sourceVo);
        return sourceVo;
    }
//    删除生源渠道
    @PutMapping("/updateSourceTimeLiness")
    public AjaxResponse updateSourceTimeLiness(@RequestBody @Valid SourceVo sourceVo){
        sourceVo.setLastupdatetime(new Date());
        log.debug("删除成功");
        sourceService.updateSourceTimeLiness(sourceVo);
        return AjaxResponse.success(sourceVo);
    }
//    查询生源渠道
    @GetMapping("/selectSource")
    public PageInfo<SourceVo> selectSource(@RequestParam("sourceName") String sourceName, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        String s="%"+sourceName+"%";
        PageHelper.startPage(currentPage,pagesize);
        List<SourceVo> findSourceNamePage = sourceService.selectSourceName(s);
        PageInfo<SourceVo> sourceVoPageInfo = new PageInfo<>(findSourceNamePage);
        return sourceVoPageInfo;
    }

}
