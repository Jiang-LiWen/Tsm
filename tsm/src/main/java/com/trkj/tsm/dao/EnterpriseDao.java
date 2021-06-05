package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Enterprise;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EnterpriseDao {
    int deleteByPrimaryKey(Integer enterpriseId);

    int insert(Enterprise enterprise);

    Enterprise selectByPrimaryKey(Integer enterpriseId);

    int updateByPrimaryKey(Enterprise enterprise);

    List<Enterprise> selectfinds();
}