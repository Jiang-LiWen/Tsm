package com.trkj.tsm.controller;

import com.trkj.tsm.entity.SysMenu;
import com.trkj.tsm.service.JwtAuthService;
import com.trkj.tsm.service.SysPermissionService;
import com.trkj.tsm.vo.AjaxResponse;
import com.trkj.tsm.vo.EmpVo;
import com.trkj.tsm.vo.LoginVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SysLoginController {
    @Autowired
    private JwtAuthService jwtAuthService;
    @Autowired
    private SysPermissionService permissionService;

    @PostMapping("/signout")
    public AjaxResponse signout() {
        log.debug("开始退出操作");
        AjaxResponse ajaxResponse = AjaxResponse.success("已退出");
        SecurityContextHolder.clearContext();
        return ajaxResponse;
    }

    @PostMapping("/login")
    public AjaxResponse login(@RequestBody LoginVo loginVo) {
        log.debug("开始验证,{}", loginVo);
        String token = jwtAuthService.login(loginVo.getUsername(), loginVo.getPassword());
        List<SysMenu> menus = permissionService.getMenuByUname(loginVo.getUsername());
        log.debug(menus.toString());
        EmpVo vo = new EmpVo();
        vo.setUsername(loginVo.getUsername());
        vo.setValidate(true);
        vo.setMenus(menus);
        vo.setToken(token);
        return AjaxResponse.success(vo);
    }
}
