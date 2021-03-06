package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.BookbackDao;
import com.trkj.tsm.entity.Bookback;
import com.trkj.tsm.service.BookbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class BookbackServiceImpl implements BookbackService {
    @Resource
    private BookbackDao bookbackDao;

    @Override
    public List<Bookback> selectAll() {
        return bookbackDao.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(int bookbackId) {
        bookbackDao.deleteByPrimaryKey(bookbackId);
        return bookbackId;
    }

    @Override
    public Bookback insert(Bookback bookback) {
        bookback.setEmpId(1);
        bookback.setStoragetime(new Date());
        //单号
        //Bookback bo=new Bookback();
        String num="SF";//定义一个固定值
        DateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");//时间的精确值
        String feesname=num+dateFormat.format(new Date())+bookback.toString().length();
        bookback.setReturnnumber(feesname);
        log.debug(feesname+toString()+"uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        bookbackDao.insert(bookback);
        return bookback;
    }

    @Override
    public List<Bookback> selectBookBack(String value, String input) {
        return bookbackDao.selectBookBack(value, input);
    }
}
