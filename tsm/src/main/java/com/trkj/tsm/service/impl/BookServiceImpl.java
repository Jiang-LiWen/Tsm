package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.BookDao;
import com.trkj.tsm.entity.Book;
import com.trkj.tsm.service.BookService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.BookVo;
import com.trkj.tsm.vo.EmpVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    @Override
    public List<Book> selectAlls1() {
        log.debug("查询所有");
        return bookDao.selectAlls1();
    }

    @Override
    public BookVo addbook(BookVo bookVo) {
        log.debug("新增信息");
        BookVo d = new BookVo();
        BeanCopyUtil.copyProperties(bookVo, d);
        bookDao.insert(d);
        return bookVo;
    }
    @Override
    public List<Book> selsebook() {
        return bookDao.selectAlls1();
    }

    @Override
    public Book updateBook(Book book) {
        bookDao.updateBook(book);
        return book;
    }

    @Override
    public List<Book> selectBook(String bookname) {
        log.debug("查询");
        return bookDao.selectByPrimaryKey1(bookname);
    }

    @Override
    public BookVo selectByPrimaryKey(Integer bookId) {
        log.debug("id查询");
        return bookDao.selectByPrimaryKey(bookId);
    }

    @Override
    public List<BookVo> selectByPrimaryKeyyyyy(BookVo bookVo) {
        BookVo d = new BookVo();
        BeanCopyUtil.copyProperties(bookVo,d);
        d.setBookId(bookVo.getBookId());
        log.debug("id查询");
        return bookDao.selectByPrimaryKeyyyyy(bookVo);
    }

}
