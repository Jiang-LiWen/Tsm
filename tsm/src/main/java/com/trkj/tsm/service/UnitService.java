package com.trkj.tsm.service;

import com.trkj.tsm.entity.Unit;
import com.trkj.tsm.vo.UnitVo;

import java.util.List;

public interface UnitService {
    int deleteByPrimaryKey(Integer unitId);

    UnitVo insert(UnitVo unitVo);

    int selectByPrimaryKey(Integer unitId);

    UnitVo updateByPrimaryKey(UnitVo unitVo);

    List<UnitVo> selectUnit();
}
