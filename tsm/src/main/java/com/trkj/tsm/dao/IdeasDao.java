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

    int updateIdeas(IdeasVo ideasVo);

    int updateByPrimaryKey(Ideas record);

    List<IdeasVo> selectState(String value1);

    List<IdeasVo> selectIdeas(String value2);

    List<IdeasVo> selectByPrimaryKey2();
}