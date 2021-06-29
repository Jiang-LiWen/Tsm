package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Opjournal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OpjournalDao {
    int deleteByPrimaryKey(Integer opjournalId);

    int insert(Opjournal record);

    int insertSelective(Opjournal record);

    Opjournal selectByPrimaryKey(Integer opjournalId);

    int updateByPrimaryKeySelective(Opjournal record);

    int updateByPrimaryKey(Opjournal record);

    List<Opjournal> selectOpjournal();
}