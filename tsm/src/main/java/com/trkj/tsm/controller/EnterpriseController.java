package com.trkj.tsm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.tsm.service.EnterpriseService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.EnterpriseVo;
import com.trkj.tsm.vo.SessionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
public class EnterpriseController {
    @Autowired
    private EnterpriseService enterpriseService;

//    @GetMapping("/selectfinds")
//    public List<Enterprise> selectfinds(){
//        log.debug("查询全部企业档案信息");
//        return enterpriseService.selectfinds();
//    }
@GetMapping("/selectEnterpriselike")
public PageInfo<EnterpriseVo> selectfindslike(@RequestParam("currentPage") int currentPage,
                                           @RequestParam("pagesize") int pagesize,
                                           @RequestParam("sech") String likeke){
    log.debug("分页查询信息");
    String likekes="%"+likeke+"%";
    log.debug("---------------------------------------------------");
    List<EnterpriseVo> entityPage =enterpriseService.selectEnterprise(likekes);
    PageHelper.startPage(currentPage,pagesize);
    log.debug(entityPage.size()+"");
    PageInfo<EnterpriseVo> enterpriseVoPageInfo = new  PageInfo<>(entityPage);
    return enterpriseVoPageInfo;
}
    @GetMapping("/selectfinds")
    public PageInfo<EnterpriseVo> selectfinds(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("分页查询信息");
        PageHelper.startPage(currentPage,pagesize);
        log.debug("---------------------------------------------------");
        List<EnterpriseVo> entityPage =enterpriseService.selectfinds();
        PageInfo<EnterpriseVo> enterpriseVoPageInfo = new  PageInfo<>(entityPage);
        return enterpriseVoPageInfo;
    }

    @PostMapping("/addenterprise")
    public AjaxResponse addEnterprise(@RequestBody @Valid EnterpriseVo enterprisevo){
        log.debug(enterprisevo.toString()+"=================");
        log.debug("新增企业档案信息");
        enterpriseService.addEnterprise(enterprisevo);
        return AjaxResponse.success(enterprisevo);
    }

    @DeleteMapping("/delenterprise/{enterpriseId}")
    public String deleteEnterprise(@PathVariable("enterpriseId") int enterpriseId){
        log.debug("根据id删除企业档案信息");
        enterpriseService.deleteEnterprise(enterpriseId);
        return "删除成功";
    }

    @PutMapping("/updenterprise")
    public AjaxResponse updateEnterprise(@RequestBody @Valid EnterpriseVo enterpriseVo){
        log.debug("修改企业档案信息");
        enterpriseService.updateEnterprise(enterpriseVo);
        return AjaxResponse.success(enterpriseVo);
    }
    @GetMapping("/selectfindss")
    public List<EnterpriseVo> selectfindss(){
        return enterpriseService.selectfindss();
    }
}
