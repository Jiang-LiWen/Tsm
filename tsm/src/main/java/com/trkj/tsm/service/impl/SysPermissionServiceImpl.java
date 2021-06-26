package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.PositionDao;
import com.trkj.tsm.dao.SysMenuDao;

import com.trkj.tsm.entity.SysMenu;
import com.trkj.tsm.service.SysPermissionService;
import com.trkj.tsm.util.MenuUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysMenuDao menuDao;
    @Autowired
    private PositionDao positionDao;

    @Override
    public List<SysMenu> getMenuByUname(String userName) {
        List<SysMenu> list = menuDao.findMenusByRoleCodes(this.getRoleCodesByUname(userName));
        return MenuUtil.assemberMenus(list);
    }

    private List<String> getRoleCodesByUname(String userName) {
        return positionDao.findRoleByUserName(userName);
    }
}
