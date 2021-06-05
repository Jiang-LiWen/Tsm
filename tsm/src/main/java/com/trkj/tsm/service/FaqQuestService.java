package com.trkj.tsmvueboot.service;

import com.trkj.tsmvueboot.entity.FaqQuestions;
import com.trkj.tsmvueboot.vo.FaqQuestionsVo;

import java.util.Date;
import java.util.List;

public interface FaqQuestService {
    FaqQuestionsVo updateTimeLiness(FaqQuestionsVo faqQuestionsVo);
//    int updateTimeLiness(Integer faqId);
    List<FaqQuestions> selectfindAll();
    List<FaqQuestionsVo> selectByProblem(String Problem);
    FaqQuestions insertSelective(FaqQuestions faqQuestions);
    FaqQuestions updateFaq(FaqQuestions faqQuestions);
}
