package com.trkj.tsm.controller;

import com.github.pagehelper.PageException;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.dao.FaqQuestionsDao;
import com.trkj.tsm.entity.FaqQuestions;
import com.trkj.tsm.service.FaqQuestService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.FaqQuestionsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class FaqQuestionController {
    @Autowired
    private FaqQuestService faqQuestService;
    @GetMapping("/findFaqAll")
    public PageInfo<FaqQuestions> findAllFaqAll(@RequestParam("currentPage") int currentPage,@RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<FaqQuestions> entityPage = faqQuestService.selectfindAll();
        PageInfo<FaqQuestions> FaqPageInfo = new PageInfo<>(entityPage);
        return FaqPageInfo;
    }
    @GetMapping("/findFaqQuestions")
    public PageInfo<FaqQuestionsVo> findAllFaqQuestions(@RequestParam("problem") String problem, @RequestParam("currentPage") int currentPage,@RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<FaqQuestionsVo> findentityPage = faqQuestService.selectByProblem(problem);
        PageInfo<FaqQuestionsVo> findFaqPageInfo = new PageInfo<>(findentityPage);
        return findFaqPageInfo;
    }
    @PostMapping("/addfaqQuestions")
    public FaqQuestions addDept(@RequestBody @Valid FaqQuestions faqQuestions){
        log.debug(faqQuestions.toString());
        faqQuestService.insertSelective(faqQuestions);
        return faqQuestions;
    }
    @PutMapping("/updateFaq")
    public FaqQuestions updateFaq(@RequestBody FaqQuestions faqQuestions){
        log.debug("开始修改");
        log.debug(faqQuestions.toString());
        faqQuestions=faqQuestService.updateFaq(faqQuestions);
        return faqQuestions;
    }
//    @PutMapping("/updateTimeLiness")
//    public int updateTimeLiness(@PathVariable("faqId") Integer faqId){
//        log.debug("开始修改");
//        return faqQuestService.updateTimeLiness(faqId);
//    }
    @PutMapping("/updateFaqTimeLiness")
    public AjaxResponse updateFaqTimeLiness(@RequestBody @Valid FaqQuestionsVo faqQuestionsVo){
        faqQuestionsVo.setDeletetime(new Date());
        log.debug("删除成功");
        faqQuestService.updateTimeLiness(faqQuestionsVo);
        return AjaxResponse.success(faqQuestionsVo);
    }
}
