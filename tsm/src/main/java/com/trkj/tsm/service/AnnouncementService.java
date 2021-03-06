package com.trkj.tsm.service;

import com.trkj.tsm.vo.AnnouncementVo;

import java.util.List;

public interface AnnouncementService {
//    显示所有
    List<AnnouncementVo> selectAnnounceManageAll();
    //    显示所有
    List<AnnouncementVo> selectAnnounceAllGongGao();
//    添加
    AnnouncementVo addAnnounceMenage(AnnouncementVo announcementVo);
//    发布
    AnnouncementVo updateAnnounceManageStat(AnnouncementVo announcementVo);
    //    暂停
    AnnouncementVo updateAnnounceManageStat2(AnnouncementVo announcementVo);
//    删除
    AnnouncementVo updateAnnounceManageTimeLiness(AnnouncementVo announcementVo);
//    修改
    AnnouncementVo updateAnnounceManage(AnnouncementVo announcementVo);
//    内容模糊查询
    List<AnnouncementVo> selectfindByContent(String Announcement_Content);
}
