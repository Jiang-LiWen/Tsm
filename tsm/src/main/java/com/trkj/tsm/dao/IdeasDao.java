package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Ideas;
import com.trkj.tsm.vo.IdeasVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IdeasDao {
    int deleteByPrimaryKey(Integer ideasId);

    int insert(IdeasVo ideasVo);

    int insertSelective(Ideas record);

    List<IdeasVo> selectByPrimaryKey();

    int updateByPrimaryKeySelective(IdeasVo ideasVo);

    int updateByPrimaryKey(Ideas record);
}