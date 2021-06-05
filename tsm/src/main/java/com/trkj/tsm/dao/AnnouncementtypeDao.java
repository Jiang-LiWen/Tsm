package com.trkj.tsmvueboot.dao;

import com.trkj.tsmvueboot.entity.Announcementtype;
import com.trkj.tsmvueboot.entity.FaqQuestions;
import com.trkj.tsmvueboot.vo.AnnouncementtypeVo;
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