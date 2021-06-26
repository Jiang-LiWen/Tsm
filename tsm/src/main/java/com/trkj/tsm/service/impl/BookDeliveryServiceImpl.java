package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.BookdeliveryDao;
import com.trkj.tsm.entity.Bookdelivery;
import com.trkj.tsm.service.BookDeliveryService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.BookVo;
import com.trkj.tsm.vo.BookdeliveryVo;
import com.trkj.tsm.vo.SystemVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class BookDeliveryServiceImpl implements BookDeliveryService {

    @Resource
    private BookdeliveryDao bookdeliveryDao;


    @Override
    public List<Bookdelivery> selectAllsss(String flag) {
        log.debug("查询所有");
        return bookdeliveryDao.selectAllsss(flag);
    }



    @Override
    public BookdeliveryVo updateByPrimaryKeymmx(BookdeliveryVo bookdeliveryVo) {
        log.debug("修改到了");
        BookdeliveryVo d = new BookdeliveryVo();
        BeanCopyUtil.copyProperties(bookdeliveryVo, d);
        bookdeliveryDao.updateByPrimaryKeymmx(d);
        return bookdeliveryVo;
    }

    @Override
    public Bookdelivery insertSelectivessb(Bookdelivery bookdelivery) {
        log.debug("新增信息");
        bookdelivery.setEmpId(1);
        Date date = new Date();
        // 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        long time = date.getTime();
        bookdelivery.setSalenumber("SF123467");
        bookdeliveryDao.insertSelectivessb(bookdelivery);
        return bookdelivery;
    }

}
