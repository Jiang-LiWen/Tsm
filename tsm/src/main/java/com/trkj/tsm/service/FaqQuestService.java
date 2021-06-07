package com.trkj.tsm.service;

import com.trkj.tsm.entity.FaqQuestions;
import com.trkj.tsm.vo.FaqQuestionsVo;

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
