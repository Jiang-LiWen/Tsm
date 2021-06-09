package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.BookDao;
import com.trkj.tsm.dao.BookstorageDao;
import com.trkj.tsm.entity.Book;
import com.trkj.tsm.entity.Bookstorage;
import com.trkj.tsm.entity.System;
import com.trkj.tsm.service.BookStorageService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.BookVo;
import com.trkj.tsm.vo.BookstorageVo;
import com.trkj.tsm.vo.SystemVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@Service
@Slf4j
public class BookStorageServiceImpl implements BookStorageService {
    @Resource
    private BookstorageDao bookstorageDao;
    @Resource
    private BookDao bookDao;

    @Override
    public List<Bookstorage> selectAllsdd() {
        log.debug("查询所有 ——————————————");
        return bookstorageDao.selectAllsdd();
    }

    @Override
    public int addBookstorage(BookstorageVo bookstorageVo) {
       bookstorageVo.setEmpId(1);
        BookVo bookVo = bookDao.selectByPrimaryKey(bookstorageVo.getBookId());
        //得到此书的进价
        BigDecimal booksprice=bookVo.getBookjprice();
        //得到此次入库此书的总价
        BigDecimal allsprice= booksprice.multiply(new BigDecimal(bookstorageVo.getStoragecount()));
        bookstorageVo.setTotalprice(allsprice);
        bookstorageDao.insertSelective(bookstorageVo);
        return 1;
    }


    @Override
    public Bookstorage updateByPrimaryKey(Bookstorage bookstorage) {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(int mbookstorageId) {
        return 0;
    }

}
