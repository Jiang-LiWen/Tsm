package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.MemorandumService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.MemorandumVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class MemorandumController {
    @Resource
    @Autowired
    private MemorandumService memorandumService;

    @GetMapping("/selectByPrimaryKey1")
    public List<MemorandumVo> selectByPrimaryKey(){
        log.debug("查看备忘录信息");
        return memorandumService.selectByPrimaryKey();
    }

    @DeleteMapping("/delenmemorandum/{memorandumid}")
    public String delenmemorandum(@PathVariable("memorandumid") int memorandumid){
        log.debug("根据id删除备忘录");
        memorandumService.deleteMemorandum(memorandumid);
        return "删除成功";
    }

    @PostMapping("/addmemorandum")
    public AjaxResponse addMemorandum(@RequestBody @Valid MemorandumVo memorandumVo){
        log.debug(memorandumVo.toString()+"=================");
        log.debug("新增备忘录");
        memorandumService.addMemorandum(memorandumVo);
        return AjaxResponse.success(memorandumVo);
    }

    @PutMapping("/updmemorandum")
    public AjaxResponse updateMemorandum(@RequestBody @Valid MemorandumVo memorandumVo){
        log.debug("修改备忘录信息");
        memorandumService.updataMemorandum(memorandumVo);
        return AjaxResponse.success(memorandumVo);
    }

    @GetMapping("/select")
    public PageInfo<MemorandumVo> select(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询信息");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<MemorandumVo> entityPage= memorandumService.selectByPrimaryKey();
        PageInfo<MemorandumVo> memorandumVoPageInfo =new PageInfo<>(entityPage);
        return memorandumVoPageInfo;

    }

}
