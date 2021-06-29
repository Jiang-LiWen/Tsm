package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.MailDao;
import com.trkj.tsm.service.MainService;
import com.trkj.tsm.vo.MainVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MainServiceImpl implements MainService {
    @Autowired
    private MailDao mailDao;

    @Override
    public List<MainVo> selectByPrimaryKey() {

        return mailDao.selectByPrimaryKey();
    }

    @Override
    public int deleteMail(Integer mailid) {
        log.debug("删除邮件成功！");
        return mailDao.deleteByPrimaryKey(mailid);

    }

    @Override
    public List<MainVo> selectmailRank(String value2) {
        return mailDao.selectmailRank(value2);
    }

    @Override
    public List<MainVo> selectState4(String value4) {
        return mailDao.selectState4(value4);
    }

    @Override
    public List<MainVo> selectOutbox() {
        return mailDao.selectOutbox();
    }

    @Override
    public MainVo insert(MainVo mainVo) {
        log.debug("攥写新邮件");
        mailDao.insert(mainVo);
        return mainVo;
    }

    @Override
    public MainVo updateByPrimaryKeySelective(MainVo mainVo) {
        log.debug("修改成功");
       mailDao.updateByPrimaryKeySelective(mainVo);
        return mainVo;
    }

    @Override
    public List<MainVo> selectmailTitle(String value13,String value3) {
        log.debug(value13+"=============================");
        return mailDao.selectmailTitle(value13, value3);
    }

    @Override
    public List<MainVo> select4(String value15, String value5) {
        return mailDao.select4(value15,value5);
    }

    @Override
    public MainVo updateMail(MainVo mainVo) {
        log.debug(mainVo.toString()+"++++++++++++++++ImpI");
        log.debug("修改废件箱信息");
        mailDao.updateMail(mainVo);
        return mainVo;
    }

    @Override
    public List<MainVo> selectMail3() {
        return mailDao.selectMail3();
    }


}
