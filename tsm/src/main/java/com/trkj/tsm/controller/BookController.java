package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.entity.Book;
import com.trkj.tsm.service.BookService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.BookVo;
import com.trkj.tsm.vo.BookdeliveryVo;
import com.trkj.tsm.vo.EmpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;


@RestController
@Slf4j
public class BookController {
    @Resource
    private BookService bookService;

    @GetMapping("/selectAlls1")
    public PageInfo<Book> selectAlls1(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("--------------------");
        List<Book> entityPage=bookService.selectAlls1();
        PageInfo<Book> BookVoPageInfo=new PageInfo<>(entityPage);
        return  BookVoPageInfo;
    }
    //教材入库
    @GetMapping("/wjselectAll")
    public List<Book> wj1selectAll(){
        List<Book> entityPage =bookService.selectAlls1();
        return entityPage;
    }
    @PostMapping("/addbook")
    public AjaxResponse addbook(@RequestBody @Valid BookVo bookVo) {
        log.debug(bookVo.toString() + "=================");
        bookService.addbook(bookVo);
        return AjaxResponse.success(bookVo);
    }

    @GetMapping("/selectBook")
    public PageInfo<Book> classroomName(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam("bookname") String bookname) {
        PageHelper.startPage(currentPage, pagesize);
        List<Book> classname = bookService.selectBook(bookname);
        PageInfo<Book> BookPageInfo = new PageInfo<>(classname);
        return BookPageInfo;
    }

    @GetMapping("/selectByPrimaryKey")
    private BookVo selectByPrimaryKey(@RequestParam("bookId") Integer bookId){
        log.debug("Controller方法调用");
        return bookService.selectByPrimaryKey(bookId);
    }

    @GetMapping("selectByPrimaryKeyyyyy")
    private List<BookVo> selectByPrimaryKeyyyyy(BookVo bookVo){
        log.debug("Controller方法调用");
        return bookService.selectByPrimaryKeyyyyy(bookVo);
    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody  Book book){
        log.debug("修改");
        bookService.updateBook(book);
        return book;
    }
}
