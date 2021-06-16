package com.trkj.tsm.controller;

import com.trkj.tsm.service.IdeasService;
import com.trkj.tsm.vo.IdeasVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class IdeasController {
    @Autowired
    private IdeasService ideasService;

    @GetMapping("/selectIdeas")
    public List<IdeasVo> selectByPrimaryKey() {
        log.debug("查看意见表");
        return ideasService.selectByPrimaryKey();
    }

    @PostMapping("/addIdeas")
    public IdeasVo addIdeas(@RequestBody @Valid IdeasVo ideasVo){
        log.debug("添加成功");
        ideasVo.setKeeper("TSM管理员");
        ideasService.insert(ideasVo);
        return ideasVo;
    }
    @GetMapping("/selectState/{value1}")
    public List<IdeasVo> selectState(@PathVariable("value1") String value1){
        log.debug("查询意见表状态未为回复的");
        return ideasService.selectState(value1);
    }

}
