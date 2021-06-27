package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Arrange;

public interface ArrangeDao {
    int deleteByPrimaryKey(Integer arrangeId);

    int insert(Arrange record);

    int insertSelective(Arrange record);

    Arrange selectByPrimaryKey(Integer arrangeId);

    int updateByPrimaryKeySelective(Arrange record);

    int updateByPrimaryKey(Arrange record);
}