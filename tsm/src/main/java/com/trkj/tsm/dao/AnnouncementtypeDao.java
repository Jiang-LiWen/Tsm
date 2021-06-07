package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Announcementtype;
import com.trkj.tsm.entity.FaqQuestions;
import com.trkj.tsm.vo.AnnouncementtypeVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnnouncementtypeDao {
    int updateAnnounceTypeTimeLiness(AnnouncementtypeVo announcementtypeVo);

    int deleteByPrimaryKey(Integer announcementtypeId);

    int insert(AnnouncementtypeVo record);

    int insertSelective(Announcementtype record);

    List<AnnouncementtypeVo> selectAnnTypeAll();

    int updateByPrimaryKeySelective(Announcementtype record);

    int updateAnnounceType(AnnouncementtypeVo record);
}