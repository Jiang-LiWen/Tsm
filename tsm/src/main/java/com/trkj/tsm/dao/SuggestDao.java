package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Suggest;
import com.trkj.tsm.vo.SuggestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SuggestDao {
    int deleteByPrimaryKey(Integer suggestId);

    int insert(Suggest record);

    int insertSelective(Suggest record);

    List<SuggestVo> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Suggest record);

    int updateByPrimaryKey(Suggest record);
}