package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.BookStorageService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.BookstorageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class BookStorageController {
    @Resource
    private BookStorageService bookStorageService;
    @GetMapping("/selectAllsdd")
    public PageInfo<BookstorageVo> selectAllsdd(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize , @RequestParam("flag") String flag){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("查询所有--------------------");
        List<BookstorageVo> entityPage=bookStorageService.selectAllsdd(flag);
        PageInfo<BookstorageVo> bookstoragePageInfo=new PageInfo<>(entityPage);
        return  bookstoragePageInfo;
    }



    //增加
    @PostMapping("/addBookstorage")
    public AjaxResponse addBookstorage(@RequestBody @Valid BookstorageVo bookstorageVo) {
        bookstorageVo.setStoragetime(new Date());
        bookStorageService.addBookstorage(bookstorageVo);
        return AjaxResponse.success(bookstorageVo);
    }


    @PutMapping("/updateByPrimaryKeyw")
    public AjaxResponse updateByPrimaryKeyw(@RequestBody @Valid BookstorageVo bookstorageVo){
        bookstorageVo.setDeletetime(new Date());
        log.debug("删除");
        bookStorageService.updateByPrimaryKeyw(bookstorageVo);
        return AjaxResponse.success(bookstorageVo);
    }


}
