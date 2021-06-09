package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Memorandum;
import com.trkj.tsm.vo.MemorandumVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemorandumDao {
    int deleteByPrimaryKey(Integer memorandumId);

    int insert(Memorandum record);

    int insertSelective(Memorandum record);

    List<MemorandumVo> selectByPrimaryKey();

//    List<MemorandumVo> selectMemorandum();

    int updateByPrimaryKeySelective(Memorandum record);

    int updateByPrimaryKey(Memorandum record);
}