package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Systemtype;
import com.trkj.tsm.vo.SystemVo;
import com.trkj.tsm.vo.SystemtypeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SystemtypeDao {
    int deleteByPrimaryKey(Integer systemtypeId);

    int insert(Systemtype record);

    int insertSelective(SystemtypeVo record);

    List<Systemtype> selectByPrimaryKey(String systemtypeName);

    int updateByPrimaryKeySelective(Systemtype record);

    int updateByPrimaryKey(Systemtype record);

    List<Systemtype> selectAlls2();

    List<Systemtype> selectAlls9();

    int updateByPrimaryKehciuj(Systemtype systemtype);
}