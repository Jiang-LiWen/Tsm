package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.AnnouncementtypeDao;
import com.trkj.tsm.dao.FaqQuestionsDao;
import com.trkj.tsm.entity.Announcementtype;
import com.trkj.tsm.entity.FaqQuestions;
import com.trkj.tsm.service.AnnouncementTypeService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.AnnouncementtypeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class AnnouncementTypeServiceImpl implements AnnouncementTypeService {
    @Resource
    private AnnouncementtypeDao announcementtypeDao;
    @Override
    public List<AnnouncementtypeVo> selectAnnTypeAll() {
        log.debug("显示全部类型");
        return announcementtypeDao.selectAnnTypeAll();
    }

    @Override
    public AnnouncementtypeVo addAnnounceType(AnnouncementtypeVo announcementtypeVo) {
        log.debug("公告类型添加成功");
        announcementtypeDao.insert(announcementtypeVo);
        return announcementtypeVo;
    }

    @Override
    public AnnouncementtypeVo updateAnnounceType(AnnouncementtypeVo announcementtypeVo) {
        log.debug("修改成功");
        announcementtypeVo.setUpdatetime(new Date());
        announcementtypeDao.updateAnnounceType(announcementtypeVo);
        return announcementtypeVo;
    }

    @Override
    public AnnouncementtypeVo updateAnnounceTypeTimeLiness(AnnouncementtypeVo announcementtypeVo) {
        log.debug("删除成功");
        AnnouncementtypeVo a = new AnnouncementtypeVo();
        BeanCopyUtil.copyProperties(announcementtypeVo,a);
        announcementtypeDao.updateAnnounceTypeTimeLiness(a);
        return announcementtypeVo;
    }
}
