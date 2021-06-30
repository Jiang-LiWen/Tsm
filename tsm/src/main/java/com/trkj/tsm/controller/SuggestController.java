package com.trkj.tsm.controller;

import com.trkj.tsm.service.SuggestService;
import com.trkj.tsm.vo.SuggestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
public class SuggestController {
    @Autowired
    private SuggestService suggestService;

    @GetMapping("/selectSuggest")
    public List<SuggestVo> selectSuggest(){
        log.debug("查看意见箱");
        return suggestService.selectByPrimaryKey();
    }
}
