package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.BookDao;
import com.trkj.tsm.dao.BookstorageDao;
import com.trkj.tsm.service.BookStorageService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.BookVo;
import com.trkj.tsm.vo.BookstorageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public List<BookstorageVo> selectAllsdd(String flag) {
        log.debug("模糊查询所有 ——————————————");
        return bookstorageDao.selectAllsdd(flag);
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
    public BookstorageVo updateByPrimaryKeyw(BookstorageVo bookstorageVo) {
        log.debug("删除");
        BookstorageVo d = new BookstorageVo();
        BeanCopyUtil.copyProperties(bookstorageVo,d);
        bookstorageDao.updateByPrimaryKeyw(d);
        return bookstorageVo;


    }


}
