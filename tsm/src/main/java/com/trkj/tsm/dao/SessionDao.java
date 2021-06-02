package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Session;
import com.trkj.tsm.vo.SessionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SessionDao {
    int deleteByPrimaryKey(Integer sessionId);

    int insert(Session session);

    int selectByPrimaryKey(Integer sessionId);

    int updateByPrimaryKey(Session session);

    int updateTimeliness(Session session);

    List<SessionVo> selectfindslike(String likeke);//页面显示加分页模糊查询

    List<SessionVo> selectSession();
}