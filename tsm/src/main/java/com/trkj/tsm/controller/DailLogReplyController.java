package com.trkj.tsm.controller;

import com.trkj.tsm.service.DailLogReplyService;
import com.trkj.tsm.vo.DailLogReplyVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class DailLogReplyController {
    @Autowired
    private DailLogReplyService dailLogReplyService;

    @GetMapping("/selectDaillogReply")
    public List<DailLogReplyVo> selectByPrimaryKey(){
        log.debug("查看工作日志回复表");
        return dailLogReplyService.selectByPrimaryKey();
    }

    @PostMapping("/addReply")
    public DailLogReplyVo addReply(@RequestBody @Valid DailLogReplyVo dailLogReplyVo){
        log.debug("添加成功");
        log.debug(dailLogReplyVo.toString());
        dailLogReplyService.insert(dailLogReplyVo);
        return dailLogReplyVo;
    }
    @PutMapping("/update")
    public DailLogReplyVo update(@RequestBody DailLogReplyVo dailLogReplyVo){
        log.debug("修改工作回复表");
        dailLogReplyVo.setRepliertime(new Date());
        dailLogReplyService.updateDaillogreply(dailLogReplyVo);
        return dailLogReplyService.updateDaillogreply(dailLogReplyVo);
    }


}
