package com.trkj.tsmvueboot.service;

import com.trkj.tsmvueboot.entity.Announcementtype;
import com.trkj.tsmvueboot.vo.AnnouncementtypeVo;
import com.trkj.tsmvueboot.vo.FaqQuestionsVo;

import java.util.List;

public interface AnnouncementTypeService {
    List<AnnouncementtypeVo> selectAnnTypeAll();
    AnnouncementtypeVo addAnnounceType(AnnouncementtypeVo announcementtypeVo);
    AnnouncementtypeVo updateAnnounceType(AnnouncementtypeVo announcementtypeVo);
    AnnouncementtypeVo updateAnnounceTypeTimeLiness(AnnouncementtypeVo announcementtypeVo);
}
