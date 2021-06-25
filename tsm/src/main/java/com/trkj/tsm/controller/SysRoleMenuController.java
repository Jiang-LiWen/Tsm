package com.trkj.tsm.controller;

import com.trkj.tsm.entity.SysRoleMenu;
import com.trkj.tsm.service.SysRoleMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SysRoleMenuController {
    @Autowired
    private SysRoleMenuService sysRoleMenuService;
    @GetMapping("findMenu")
    public List<SysRoleMenu> findMenu(){
        return sysRoleMenuService.findMenu();
    }
}
