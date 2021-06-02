package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.UnittypeService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.UnittypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
public class UnittypeController {
    @Autowired
    private UnittypeService unittypeService;
    //分页查询
    @GetMapping("/selectUnittype")
    public PageInfo<UnittypeVo> selectUnittype(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询单位类型信息");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<UnittypeVo> entityPage =unittypeService.selectUnittype();
        PageInfo<UnittypeVo> unittypeVoPageInfo = new  PageInfo<>(entityPage);
        return unittypeVoPageInfo;
    }

    //分页查询
    @GetMapping("/selectUnittypes")
    public List<UnittypeVo> selectUnittypes(){
        log.debug("查询");

        log.debug("---------------------------------------------------");

        return unittypeService.selectUnittypes();
    }
    //新增操作
    @PostMapping("/addUnittype")
    public AjaxResponse addUnittype(@RequestBody @Valid UnittypeVo unittypeVo){
        log.debug(unittypeVo.toString()+"=================");
        log.debug("新增单位类型信息");
        unittypeService.insert(unittypeVo);
        return AjaxResponse.success(unittypeVo);
    }
    //删除操作
    @DeleteMapping("/deleteUnittype/{unittypeId}")
    public String deleteUnittype(@PathVariable("unittypeId") int unittypeId){
        log.debug("根据id删除单位类型信息");
        unittypeService.deleteByPrimaryKey(unittypeId);
        return "删除成功";
    }
    //修改操作
    @PutMapping("/updateUnittype")
    public AjaxResponse updateUnittype(@RequestBody @Valid UnittypeVo unittypeVo){
        log.debug("修改单位类型信息");
        unittypeService.updateByPrimaryKey(unittypeVo);
        return AjaxResponse.success(unittypeVo);
    }
    //根据id进行重新
    @GetMapping("/selectUnittypeId/{unittypeId}")
    public String selectUnittypeId(@PathVariable("unittypeId") int unittypeId){
        log.debug("根据id查询单位类型信息");
        unittypeService.selectByPrimaryKey(unittypeId);
        return "查询成功";
    }
}
