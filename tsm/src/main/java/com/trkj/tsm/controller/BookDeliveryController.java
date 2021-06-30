package com.trkj.tsm.controller;


import com.trkj.tsm.entity.Bookdelivery;
import com.trkj.tsm.service.BookDeliveryService;
import com.trkj.tsm.service.BookService;
import com.trkj.tsm.service.DeliveryddetailsServce;
import com.trkj.tsm.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class BookDeliveryController {
    @Resource
    private DeliveryddetailsServce deliveryddetailsServce;

    @Resource
    private BookDeliveryService bookDeliveryService;



    @GetMapping("/selectAllsss")
    public List<Bookdelivery> selectAllsss(@RequestParam("flag") String flag){
        List<Bookdelivery> entityPage =bookDeliveryService.selectAllsss(flag);
        return entityPage;
    }


    @PutMapping("/updateByPrimaryKeymmx")
    public AjaxResponse updateByPrimaryKeymmx(@RequestBody @Valid BookdeliveryVo bookdeliveryVo){
        log.debug("修改");
        bookdeliveryVo.setApptime(new Date());
        //获取当前时间
        bookDeliveryService.updateByPrimaryKeymmx(bookdeliveryVo);
        return AjaxResponse.success(bookdeliveryVo);
    }

    //增加
    @PostMapping("/insertSelectivessb")
    public Bookdelivery insertSelectivessb(@RequestBody @Valid Bookdelivery bookdelivery) {
        bookdelivery.setDeliverytime(new Date());
        bookDeliveryService.insertSelectivessb(bookdelivery);
        return bookdelivery;
    }
}
