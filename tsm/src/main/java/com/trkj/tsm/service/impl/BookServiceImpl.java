package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.BookDao;
import com.trkj.tsm.entity.Book;
<<<<<<< HEAD:tsm/src/main/java/com/trkj/tsm/service/BookServiceImpl.java
import com.trkj.tsm.entity.Classroom;
=======
import com.trkj.tsm.service.BookService;
>>>>>>> 47f2255cab8771c806c2144157ebaedfe8d0eab4:tsm/src/main/java/com/trkj/tsm/service/impl/BookServiceImpl.java
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.BookVo;
import com.trkj.tsm.vo.ClassroomVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
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
        log.debug("分页查询所有");
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
    public List<Book> selectBook(String bookname) {
        log.debug("查询");
        return bookDao.selectByPrimaryKey(bookname);
    }

}
