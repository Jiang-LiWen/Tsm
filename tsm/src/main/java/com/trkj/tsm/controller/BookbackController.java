package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Bookback;
import com.trkj.tsm.service.BookbackService;
import com.trkj.tsm.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class BookbackController {
    @Autowired
    private BookbackService bookbackService;

    @GetMapping("/findPage6")
    public PageInfo<Bookback> findPage(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<Bookback> entityPage=bookbackService.selectAll();
        PageInfo<Bookback> classtypePageInfo=new PageInfo<>(entityPage);
        return classtypePageInfo;
    }

    @DeleteMapping("/delBookback")
    public String delBookback(@RequestParam("bookbackId") int bookbackId){
        log.debug("开始删除");
        bookbackService.deleteByPrimaryKey(bookbackId);
        return "delOk";
    }

    @PostMapping("/addBookback")
    public AjaxResponse insert(@RequestBody Bookback bookback){
        bookbackService.insert(bookback);
        return AjaxResponse.success("退回成功");
    }

    @GetMapping("/selectBookback")
    public List<Bookback> selectBookback(@RequestParam("value") String value, @RequestParam("input") String input){
        return bookbackService.selectBookBack(value, input);
    }
}
