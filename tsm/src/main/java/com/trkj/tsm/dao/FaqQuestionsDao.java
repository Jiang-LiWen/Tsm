package com.trkj.tsm.dao;

import com.trkj.tsm.entity.FaqQuestions;
import com.trkj.tsm.vo.FaqQuestionsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface FaqQuestionsDao {
    int updateTimeLiness(FaqQuestions faqQuestions);

//    int updateTimeLiness(Integer faqId);

    int deleteByPrimaryKey(Integer faqId);

    int insert(FaqQuestions record);

    List<FaqQuestionsVo> selectByProblem(String Problem);

    List<FaqQuestions> selectfindAll();

    int updateByPrimaryKeySelective(FaqQuestions faqId);

    int updateByPrimaryKey(FaqQuestions record);
}