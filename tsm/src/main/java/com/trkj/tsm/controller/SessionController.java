package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.SessionService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.SemesterVo;
import com.trkj.tsm.vo.SessionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class SessionController {
    @Autowired
    private SessionService sessionService;

    @GetMapping("/selectSessionlike")
    public PageInfo<SessionVo> selectfindslike(@RequestParam("currentPage") int currentPage,
                                                 @RequestParam("pagesize") int pagesize,
                                                 @RequestParam("sech") String likeke){
        log.debug("分页查询信息");
        String likekes="%"+likeke+"%";
        log.debug("---------------------------------------------------");
        List<SessionVo> entityPage =sessionService.selectfindslike(likekes);
        PageHelper.startPage(currentPage,pagesize);
        log.debug(entityPage.size()+"");
        PageInfo<SessionVo> sessionVoPageInfo = new  PageInfo<>(entityPage);
        return sessionVoPageInfo;
    }
    @GetMapping("/selectSession")
    public PageInfo<SessionVo> selectSession(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询学期");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<SessionVo> entityPage =sessionService.selectSession();
        PageInfo<SessionVo> sessionVoPageInfo = new  PageInfo<>(entityPage);
        return sessionVoPageInfo;
    }
    //新增操作
    @PostMapping("/addSession")
    public AjaxResponse addSession(@RequestBody @Valid SessionVo sessionVo){

        log.debug("新增年届信息");
        sessionService.insert(sessionVo);
        return AjaxResponse.success(sessionVo);
    }
    //删除操作
    @DeleteMapping("/deleteSession/{sessionId}")
    public String deleteSession(@PathVariable("sessionId") int sessionId){
        log.debug("根据id删除年届信息");
        sessionService.deleteByPrimaryKey(sessionId);
        return "删除成功";
    }
    //批量删除
    @PutMapping("/updateTimeliness")
    public AjaxResponse updateTimeliness(@RequestBody @Valid SessionVo sessionVo){
        log.debug("批量删除年届信息");
        log.debug(sessionVo.toString());
        sessionVo.setDeletetime(new Date());
        sessionService.updateTimeliness(sessionVo);
        return AjaxResponse.success(sessionVo);
    }
    //修改操作
    @PutMapping("/updateSession")
    public AjaxResponse updateSession(@RequestBody @Valid SessionVo sessionVo){
        log.debug("修改年届信息");
        sessionVo.setUpdatetime(new Date());
        sessionService.updateByPrimaryKey(sessionVo);
        return AjaxResponse.success(sessionVo);
    }
    //根据id进行重新
    @GetMapping("/selectSessionId/{sessionId}")
    public String selectSessionId(@PathVariable("sessionId") int sessionId){
        log.debug("根据id查询年届信息");
        sessionService.selectByPrimaryKey(sessionId);
        return "查询成功";
    }
}
