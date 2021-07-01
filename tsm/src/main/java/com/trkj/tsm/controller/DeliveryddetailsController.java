package com.trkj.tsm.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Deliveryddetails;
import com.trkj.tsm.service.DeliveryddetailsServce;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.BookdeliveryVo;
import com.trkj.tsm.vo.BookstorageVo;
import com.trkj.tsm.vo.DeliveryddetailsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class DeliveryddetailsController {

    @Resource
    private DeliveryddetailsServce deliveryddetailsServce;




    @GetMapping("/selectAllssss")
    public PageInfo<Deliveryddetails> selectAllssss(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize , @RequestParam("flag") String flag){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("--------------------");
        List<Deliveryddetails> entityPage=deliveryddetailsServce.selectAllssss(flag);
        PageInfo<Deliveryddetails> BookdeliveryPageInfo=new PageInfo<>(entityPage);
        return  BookdeliveryPageInfo;
    }

    //增加
    @PostMapping("/insertSelectivehhp")
    public AjaxResponse insertSelectivehhp(@RequestBody @Valid Deliveryddetails deliveryddetails) {
        deliveryddetailsServce.insertSelectivehhp(deliveryddetails);

        log.debug("--------------------大大新增");
        return AjaxResponse.success(deliveryddetails);
    }

    @PutMapping("/updateByPrimaryKeymmc")
    public AjaxResponse updateByPrimaryKeymmc(@RequestBody @Valid Deliveryddetails deliveryddetails){
        log.debug("修改");
        log.debug(deliveryddetails.toString()+"mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        deliveryddetailsServce.updateByPrimaryKeymmc(deliveryddetails);
        return AjaxResponse.success(deliveryddetails);
    }

}
