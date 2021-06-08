package com.trkj.tsm.controller;

import com.trkj.tsm.service.DaillogService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.DaillogVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class DailLogController {
    @Autowired
    private DaillogService daillogService;

    @GetMapping("/selectByPrimaryKey2")
    public List<DaillogVo> selectByPrimaryKey() {
        log.debug("查看工作日志表");
        return daillogService.selectByPrimaryKey();
    }

    @DeleteMapping("/deledaillog/{daillogId}")
    public String deledaillog(@PathVariable("daillogId") Integer daillogId) {
        log.debug("根据id删除备忘录");
        daillogService.deledaillog(daillogId);
        return "删除成功";
    }

    @PostMapping("/adddaillog")
    public AjaxResponse addMemorandum(@RequestBody @Valid DaillogVo daillogVo) {
        log.debug(daillogVo.toString() + "=================");
        log.debug("新增备忘录");
        daillogService.addDaillog(daillogVo);
        return AjaxResponse.success(daillogVo);
    }

}
