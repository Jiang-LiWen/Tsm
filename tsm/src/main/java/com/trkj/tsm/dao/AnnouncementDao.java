package com.trkj.tsmvueboot.dao;

import com.trkj.tsmvueboot.entity.Announcement;
import com.trkj.tsmvueboot.vo.AnnouncementVo;
import com.trkj.tsmvueboot.vo.AnnouncementtypeVo;
import com.trkj.tsmvueboot.vo.FaqQuestionsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AnnouncementDao {
//    显示所有
    List<AnnouncementVo> selectAnnounceManageAll();
//
    int deleteByPrimaryKey(Integer announcementId);
//
    int insertAnnounceManage(AnnouncementVo record);
//
    int insertSelective(Announcement record);
//
    int updateByPrimaryKeySelective(Announcement record);
//  发布
    int updateByAnnouncementState(AnnouncementVo announcementVo);
//  暂停
    int updateByAnnouncementState2(AnnouncementVo announcementVo);
//    删除
    int updateAnnounceManageTimeLiness(AnnouncementVo announcementVo);
//    修改
    int updateAnnounceManage(AnnouncementVo record);
//    查询
    List<AnnouncementVo> selectfindByAnnouncementContent(String announcementContent);
}