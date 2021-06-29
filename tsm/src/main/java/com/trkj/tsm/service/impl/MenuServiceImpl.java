package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.SysMenuDao;
import com.trkj.tsm.service.MenuService;
import com.trkj.tsm.vo.MenuVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/***
 * @author 大熊
 * @date 2020-07-03
 * @Description:菜单（权限）业务实现类
 * @version 1.0
 */
@Service
@Slf4j
public class MenuServiceImpl implements MenuService {
    @Autowired
    private SysMenuDao sysMenuDao;

    @Override
    public List<MenuVo> findMenuByPidAndLevel(int pid, byte level) {
        log.info("开始查询菜单,pid={},level={}", pid, level);
        // List<SysMenu> list=sysMenuDao.findByMenuPidAndAndLevelOrderBySortDesc(pid,level);
        // return DozerUtils.mapList(list, MenuVo.class);
        return null;
    }
}
