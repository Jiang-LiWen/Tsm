package com.trkj.tsm.controller;

import com.trkj.tsm.entity.Enterprise;
import com.trkj.tsm.service.EnterpriseService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.EnterpriseVo;
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

    @GetMapping("/selectfinds")
    public List<Enterprise> selectfinds() {
        log.debug("查询全部企业档案信息");
        return enterpriseService.selectfinds();
    }

//    @GetMapping("/selectEnterprise/{enterpriseId}")
//    public Enterprise selectById(@PathVariable("enterpriseId") int enterpriseId){
//        log.debug("根据id查询企业档案信息");
//        enterpriseService.selectEnterprise(enterpriseId);
//        return enterprise;
//    }

    @PostMapping("/addenterprise")
    public AjaxResponse addEnterprise(@RequestBody @Valid EnterpriseVo enterprisevo) {
        log.debug(enterprisevo.toString() + "=================");
        log.debug("新增企业档案信息");
        enterpriseService.addEnterprise(enterprisevo);
        return AjaxResponse.success(enterprisevo);
    }

    @DeleteMapping("/delenterprise/{enterpriseId}")
    public String deleteEnterprise(@PathVariable("enterpriseId") int enterpriseId) {
        log.debug("根据id删除企业档案信息");
        enterpriseService.deleteEnterprise(enterpriseId);
        return "删除成功";
    }

    @PutMapping("/updenterprise")
    public AjaxResponse updateEnterprise(@RequestBody @Valid EnterpriseVo enterpriseVo) {
        log.debug("修改企业档案信息");
        enterpriseService.updateEnterprise(enterpriseVo);
        return AjaxResponse.success(enterpriseVo);
    }
}
