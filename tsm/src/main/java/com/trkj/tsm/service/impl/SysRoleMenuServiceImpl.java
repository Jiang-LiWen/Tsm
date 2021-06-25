package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.SysRoleMenuDao;
import com.trkj.tsm.entity.SysRoleMenu;
import com.trkj.tsm.service.SysRoleMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SysRoleMenuServiceImpl implements SysRoleMenuService {
    @Autowired
    private SysRoleMenuDao sysRoleMenuDao;
    @Override
    public List<SysRoleMenu> findMenu() {
        return sysRoleMenuDao.findMenu();
    }
}
