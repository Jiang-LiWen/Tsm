package com.trkj.tsm.controller;

import com.trkj.tsm.service.IdeasService;
import com.trkj.tsm.vo.AjaxResponse;
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
        log.debug("查看收到的意见");
        return ideasService.selectByPrimaryKey();
    }

    @PostMapping("/addIdeas")
    public IdeasVo addIdeas(@RequestBody @Valid IdeasVo ideasVo){
        log.debug("添加成功");
        ideasVo.setKeeper("TSM管理员");
        ideasVo.setType(1);
        ideasService.insert(ideasVo);
        return ideasVo;
    }
    @GetMapping("/selectState")
    public List<IdeasVo> selectState(@RequestParam String value1){
        log.debug("查询意见发件表状态未为回复的");
        return ideasService.selectState(value1);
    }

    @GetMapping("/selectIdeas2")
    public List<IdeasVo> selectIdeas(@RequestParam String value2){
        log.debug("查询收件表状态");
        List<IdeasVo> ideasVos=ideasService.selectIdeas(value2);
        log.debug("dd"+ideasVos.toString());
        return ideasVos;
    }

    @GetMapping("/selectByPrimaryKey2")
    public List<IdeasVo> selectByPrimaryKey2(){
        log.debug("查看发出的意见");
        return ideasService.selectByPrimaryKey2();
    }

    @PutMapping("/selectIdeas1")
    public AjaxResponse selectIdeas(@RequestBody @Valid IdeasVo ideasVo){
        log.debug("修改信息");
        ideasVo.setReply("婷婷");
        ideasVo.setState("0");
        ideasVo=ideasService.updateIdeas(ideasVo);
        log.debug(ideasVo.toString());
        return AjaxResponse.success(ideasVo);
    }

}
