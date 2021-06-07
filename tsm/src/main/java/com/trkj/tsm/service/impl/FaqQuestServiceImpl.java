package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.FaqQuestionsDao;
import com.trkj.tsm.entity.FaqQuestions;
import com.trkj.tsm.service.FaqQuestService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.FaqQuestionsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class FaqQuestServiceImpl implements FaqQuestService {
    @Resource
    private FaqQuestionsDao faqQuestionsDao;

//    @Override
//    public int updateTimeLiness(Integer faqId) {
//        log.debug("删除成功");
//        return faqQuestionsDao.updateTimeLiness(faqId);
//    }
    @Override
    public FaqQuestionsVo updateTimeLiness(FaqQuestionsVo faqQuestionsVo) {
        log.debug("删除成功");
        FaqQuestions f = new FaqQuestions();
        BeanCopyUtil.copyProperties(faqQuestionsVo,f);
        faqQuestionsDao.updateTimeLiness(f);
        return faqQuestionsVo;
    }

    @Override
    public List<FaqQuestions> selectfindAll() {
        log.debug("显示所有");
        return faqQuestionsDao.selectfindAll();
    }

    @Override
    public List<FaqQuestionsVo> selectByProblem(String Problem) {
        log.debug("查询成功");
        return faqQuestionsDao.selectByProblem(Problem);
    }

    @Override
    public FaqQuestions insertSelective(FaqQuestions faqQuestions) {
        log.debug("添加成功");
        faqQuestionsDao.insert(faqQuestions);
        return faqQuestions;
    }

    @Override
    public FaqQuestions updateFaq(FaqQuestions faqQuestions) {
        log.debug("修改成功");
        faqQuestionsDao.updateByPrimaryKey(faqQuestions);
        return faqQuestions;
    }
}
