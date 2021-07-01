package com.trkj.tsm.service;

import com.trkj.tsm.entity.Systemtype;

import java.util.List;

public interface SystemTypeService {
    List<Systemtype> selectAlls2();

    List<Systemtype> selectAlls9();

    Systemtype addSysyemtype(Systemtype systemtype);

    Systemtype updateSysyemtype(Systemtype systemtype);

    List<Systemtype> selectSysyemtype(String systemtypeName);

    int updateByPrimaryKehciuj(Integer systemtypeId);



}
