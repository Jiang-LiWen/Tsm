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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        String num="SF";//定义一个固定值
        DateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");//时间的精确值
        String feesname=num+dateFormat.format(new Date())+bookdelivery.toString().length();
        bookdelivery.setSalenumber(feesname);
        bookdeliveryDao.insertSelectivessb(bookdelivery);
        return bookdelivery;
    }

}
