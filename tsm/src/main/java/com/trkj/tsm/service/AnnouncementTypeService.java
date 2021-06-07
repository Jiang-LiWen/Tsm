package com.trkj.tsm.service;

import com.trkj.tsm.entity.Announcementtype;
import com.trkj.tsm.vo.AnnouncementtypeVo;
import com.trkj.tsm.vo.FaqQuestionsVo;

import java.util.List;

public interface AnnouncementTypeService {
    List<AnnouncementtypeVo> selectAnnTypeAll();
    AnnouncementtypeVo addAnnounceType(AnnouncementtypeVo announcementtypeVo);
    AnnouncementtypeVo updateAnnounceType(AnnouncementtypeVo announcementtypeVo);
    AnnouncementtypeVo updateAnnounceTypeTimeLiness(AnnouncementtypeVo announcementtypeVo);
}
