package com.trkj.tsm.controller;

import com.trkj.tsm.service.ReturnvisitService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.RegisterVo;
import com.trkj.tsm.vo.ReturnvisitVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class ReturnvisitController {
    @Autowired
    private ReturnvisitService returnvisitService;
//    显示
    @GetMapping("/selectReturnRegisterID")
    public List<ReturnvisitVo> selectReturnRegisterID(@RequestParam("registerId") Integer registerId){
        log.debug("根据生源渠道id显示数据(Controller)");
        List<ReturnvisitVo> findReturnRegister = returnvisitService.selectReturnVisit(registerId);
        return findReturnRegister;
    }
//    增加
    @PostMapping("/addReturnisit")
    public AjaxResponse addReturnisit(@RequestBody @Valid ReturnvisitVo returnvisitVo){
        log.debug("添加成功");
        log.debug(returnvisitVo.toString()+"======/////");
        returnvisitService.insertReturnvisit(returnvisitVo);
        return AjaxResponse.success("添加回访记录成功");
    }
    //    删除
    @PutMapping("/updateReturnVisitTimeLiness")
    public AjaxResponse updateReturnVisitTimeLiness(@RequestBody @Valid ReturnvisitVo returnvisitVo){
        returnvisitVo.setDeletetime(new Date());
        log.debug("删除成功");
        returnvisitService.updateReturnVisitTimeLiness(returnvisitVo);
        return AjaxResponse.success(returnvisitVo);
    }
}
