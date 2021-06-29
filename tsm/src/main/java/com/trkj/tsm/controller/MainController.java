package com.trkj.tsm.controller;

import com.trkj.tsm.service.MainService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.MainVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/selectMain")
    public List<MainVo> selectByPrimaryKey() {
        log.debug("查询收件表信息");
        return mainService.selectByPrimaryKey();
    }

    @GetMapping("/selectOutbox")
    public List<MainVo> selectOutbox(){
        log.debug("查询发件表信息");
        return mainService.selectOutbox();
    }

    @DeleteMapping("/delentmain/{mainId}")
    public String delentMain(@PathVariable("mainId") int mainId) {
        log.debug("根据id删除邮件");
        mainService.deleteMail(mainId);
        return "删除成功";
    }
    @GetMapping("/selectmailRank/{value2}")
    public List<MainVo> selectmailRank(@PathVariable("value2") String value2){
        log.debug("根据阅读状态查询");
        return mainService.selectmailRank(value2);
    }
    @GetMapping("/selectState4/{value4}")
    public List<MainVo> selectState4(@PathVariable("value4") String value4){
        log.debug("根据级别查询");
        return mainService.selectState4(value4);
    }
    @PostMapping("/addMain")
    public MainVo addMain(@RequestBody @Valid MainVo mainVo){
        log.debug("添加成功");
        mainVo.setType(1);
        mainService.insert(mainVo);
        return mainVo;
    }
    @PutMapping("/updateByPrimaryKeySelective")
    public AjaxResponse updateByPrimaryKeySelective(@RequestBody @Valid MainVo mainVo){
        log.debug("修改状态");
        mainService.updateByPrimaryKeySelective(mainVo);
        return AjaxResponse.success(mainVo);
    }

    @GetMapping("/selectmailTitle/{value13}/{value3}")
    public List<MainVo> selectmailTitle(@PathVariable("value13") String value13,@PathVariable("value3") String value3){
        log.debug(value3);
        log.debug("根据标题发送人模糊查询");
        List<MainVo> mainVoList=mainService.selectmailTitle(value13,value3);
        return mainVoList;

    }

    @GetMapping("/select4/{value15}/{value5}")
    public List<MainVo> select4(@PathVariable("value15") String value15,@PathVariable("value5") String value5){
        log.debug("发件箱模糊查询");
        List<MainVo> mainVoList1=mainService.select4(value15,value5);
        return mainVoList1;
    }

    @PutMapping("/updateMail")
    public MainVo updateMail(@RequestBody @Valid MainVo mainVo){
        log.debug("修改废件箱信息");
        log.debug(mainVo.toString()+"=======================COller");
        mainVo.setDeletetime(new Date());
        mainVo.setDeletename("管理员");
        mainService.updateMail(mainVo);
        return mainVo;
    }

    @GetMapping("/selectMail3")
    public List<MainVo> selectMail3(){
        log.debug("删除到废件箱");
        return mainService.selectMail3();
    }

}
