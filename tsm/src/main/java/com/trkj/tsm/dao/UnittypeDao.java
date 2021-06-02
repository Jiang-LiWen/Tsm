package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Unittype;
import com.trkj.tsm.vo.UnittypeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UnittypeDao {

    int deleteByPrimaryKey(Integer unittypeId);

    int insert(Unittype unittype);

    UnittypeVo selectByPrimaryKey(Integer unittypeId);

    int updateByPrimaryKey(Unittype unittype);

    List<UnittypeVo> selectUnittype();

    List<UnittypeVo> selectUnittypes();
}