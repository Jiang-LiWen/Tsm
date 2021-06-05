package com.trkj.tsm.service;

import com.trkj.tsm.vo.SystemVo;

import java.util.List;

public interface SystSevice {

    List<SystemVo> selectAllSystem();

    SystemVo addsSystem(SystemVo systemVo);

    int deleteSystem(Integer systemId);//删除

    SystemVo updateByPrimaryKey1(SystemVo systemVo);

    SystemVo updateSysyem(SystemVo systemVo);

    SystemVo updateByPrimaryKey2(SystemVo systemVo);

    SystemVo updateByPrimaryKey3(SystemVo systemVo);
}
