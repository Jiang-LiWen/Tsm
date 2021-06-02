package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.PositionService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.PositionVo;
import com.trkj.tsm.vo.SessionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class PositionController {
    @Autowired
    private PositionService positionService;

    @GetMapping("/selectPositionlike")
    public PageInfo<PositionVo> selectfindslike(@RequestParam("currentPage") int currentPage,
                                               @RequestParam("pagesize") int pagesize,
                                               @RequestParam("sech") String likeke){
        log.debug("分页查询信息");
        String likekes="%"+likeke+"%";
        log.debug("---------------------------------------------------");
        List<PositionVo> entityPage =positionService.selectPositionlike(likekes);
        PageHelper.startPage(currentPage,pagesize);
        log.debug(entityPage.size()+"");
        PageInfo<PositionVo> positionVoPageInfo = new  PageInfo<>(entityPage);
        return positionVoPageInfo;
    }
    @GetMapping("/selectPosition")
    public PageInfo<PositionVo> selectPosition(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询职位");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<PositionVo> entityPage =positionService.selectPosition();
        PageInfo<PositionVo> positionVoPageInfo = new  PageInfo<>(entityPage);
        return positionVoPageInfo;
    }
    //新增操作
    @PostMapping("/addPosition")
    public AjaxResponse addPosition(@RequestBody @Valid PositionVo positionVo){

        log.debug("新增年届信息");
        positionService.insert(positionVo);
        return AjaxResponse.success(positionVo);
    }
    //删除操作
    @DeleteMapping("/deletePosition/{positionId}")
    public String deletePosition(@PathVariable("positionId") int positionId){
        log.debug("根据id删除职位信息");
        positionService.deleteByPrimaryKey(positionId);
        return "删除成功";
    }
    //批量删除
    @PutMapping("/updatePositionTimeliness")
    public AjaxResponse updatePositionTimeliness(@RequestBody @Valid PositionVo positionVo){
        log.debug("批量删除职位信息");
        positionVo.setDeletetime(new Date());
        positionService.updatePositionTimeliness(positionVo);
        return AjaxResponse.success(positionVo);
    }
    //修改操作
    @PutMapping("/updatePosition")
    public AjaxResponse updatePosition(@RequestBody @Valid PositionVo positionVo){
        log.debug("修改年届信息");
        positionVo.setUpdatetime(new Date());
        positionService.updateByPrimaryKey(positionVo);
        return AjaxResponse.success(positionVo);
    }

    @GetMapping("/selectPositions")
    public List<PositionVo> selectPositions(){
        return positionService.selectPositions();
    }

}
