package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Mail;
import com.trkj.tsm.vo.MainVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MailDao {
    int deleteByPrimaryKey(Integer mailId);

    int insert(MainVo mainVo);

    int insertSelective(Mail record);
//收件箱显示
    List<MainVo> selectByPrimaryKey();

    int updateByPrimaryKeySelective(MainVo mainVo);

    int updateByPrimaryKey(Mail record);

    List<MainVo> selectmailRank(String value2);

    List<MainVo> selectState4(String value4);

    List<MainVo> selectOutbox();

    List<MainVo> selectmailTitle(@Param("value13")String value13,@Param("value3") String value3);

    List<MainVo> select4(@Param("value15")String value15,@Param("value5")String value5);

    int updateMail(MainVo mainVo);//删除到废件箱

    List<MainVo> selectMail3();
}