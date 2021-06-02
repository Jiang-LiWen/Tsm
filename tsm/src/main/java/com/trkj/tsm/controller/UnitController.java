package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.UnitService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.UnitVo;
import com.trkj.tsm.vo.UnittypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
public class UnitController {
    @Autowired
    private UnitService unitService;
    //分页查询
    @GetMapping("/selectUnit")
    public PageInfo<UnitVo> selectUnit(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询单位类型信息");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<UnitVo> entityPage =unitService.selectUnit();
        PageInfo<UnitVo> unitVoPageInfo = new  PageInfo<>(entityPage);
        return unitVoPageInfo;
    }
    //新增操作
    @PostMapping("/addUnit")
    public AjaxResponse addUnit(@RequestBody @Valid UnitVo unitVo){

        log.debug("新增单位类型信息");
        unitService.insert(unitVo);
        return AjaxResponse.success(unitVo);
    }
    //删除操作
    @DeleteMapping("/deleteUnit/{unitId}")
    public String deleteUnit(@PathVariable("unitId") int unitId){
        log.debug("根据id删除单位类型信息");
        unitService.deleteByPrimaryKey(unitId);
        return "删除成功";
    }
    //修改操作
    @PutMapping("/updateUnit")
    public AjaxResponse updateUnit(@RequestBody @Valid UnitVo unitVo){
        log.debug("修改单位类型信息");
        unitService.updateByPrimaryKey(unitVo);
        return AjaxResponse.success(unitVo);
    }
    //根据id进行重新
    @GetMapping("/selectUnitId/{unitId}")
    public String selectUnittypeId(@PathVariable("unitId") int unitId){
        log.debug("根据id查询单位类型信息");
        unitService.selectByPrimaryKey(unitId);
        return "查询成功";
    }
}
