package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Daillogreply;
import com.trkj.tsm.vo.DailLogReplyVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DaillogreplyDao {
    int deleteByPrimaryKey(Integer daillogreplyId);

    int insert(DailLogReplyVo dailLogReplyVo);

    int insertSelective(Daillogreply record);

    List<DailLogReplyVo> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Daillogreply record);

    int updateByPrimaryKey(Daillogreply record);
}