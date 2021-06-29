package com.trkj.tsm.service;

import com.trkj.tsm.vo.MainVo;

import java.util.List;

public interface MainService {
    List<MainVo> selectByPrimaryKey();//查看

    int deleteMail(Integer Mailid);//删除

    List<MainVo> selectmailRank(String value2);//查询阅读状态未读已读

    List<MainVo> selectState4(String value4);//根据级别查询普通邮件重要邮件

    List<MainVo> selectOutbox();//查看发件箱

    MainVo insert(MainVo mainVo);//攥写新邮件

    MainVo updateByPrimaryKeySelective(MainVo mainVo);//修改状态

    List<MainVo> selectmailTitle(String value13,String value3);//根据标题发送人模糊查询

    List<MainVo> select4(String value15,String value5);//发件表根据标题发送人搜索

    MainVo updateMail(MainVo mainVo);//删除到废件箱

    List<MainVo> selectMail3();//显示到废件箱
}
