package com.trkj.tsm.service;

import com.trkj.tsm.vo.PositionVo;
import com.trkj.tsm.vo.UnittypeVo;

import java.util.List;

public interface UnittypeService {
    int deleteByPrimaryKey(Integer unittypeId);

    UnittypeVo insert(UnittypeVo unittypeVo);

    int selectByPrimaryKey(Integer unittypeId);

    UnittypeVo updateByPrimaryKey(UnittypeVo unittypeVo);

    List<UnittypeVo> selectUnittype();

    List<UnittypeVo> selectUnittypes();

    List<UnittypeVo> selectPositionlike(String likeke);//页面显示加分页模糊查询
}
