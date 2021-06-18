package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.AnnouncementDao;
import com.trkj.tsm.service.AnnouncementService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.AnnouncementVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@RestController
@Slf4j
public class AnnouncementServiceImpl implements AnnouncementService
{
    @Resource
    private AnnouncementDao announcementDao;
    @Override
    public List<AnnouncementVo> selectAnnounceManageAll() {
        log.debug("显示所有公告");
        return announcementDao.selectAnnounceManageAll();
    }

    @Override
    public List<AnnouncementVo> selectAnnounceAllGongGao() {
        log.debug("显示可视公告");
        return announcementDao.selectAnnounceAllGongGao();
    }

    @Override
    public AnnouncementVo addAnnounceMenage(AnnouncementVo announcementVo) {
        log.debug("公告管理添加成功");
        log.debug(announcementVo.toString());
        announcementVo.setAnnouncementtypeId(announcementVo.getAnnouncementtype().getAnnouncementtypeId());
        announcementDao.insertAnnounceManage(announcementVo);
        return announcementVo;
    }

    @Override
    public AnnouncementVo updateAnnounceManageStat(AnnouncementVo announcementVo) {
        log.debug("发布成功");
        AnnouncementVo a = new AnnouncementVo();
        BeanCopyUtil.copyProperties(announcementVo,a);
        log.debug(a.toString()+"-----------------------");
        announcementDao.updateByAnnouncementState(a);
        return announcementVo;
    }
    @Override
    public AnnouncementVo updateAnnounceManageStat2(AnnouncementVo announcementVo) {
        log.debug("暂停成功");
        AnnouncementVo a = new AnnouncementVo();
        BeanCopyUtil.copyProperties(announcementVo,a);
        log.debug(a.toString()+"-----------------------");
        announcementDao.updateByAnnouncementState2(a);
        return announcementVo;
    }
//删除
    @Override
    public AnnouncementVo updateAnnounceManageTimeLiness(AnnouncementVo announcementVo) {
        log.debug("删除成功");
        AnnouncementVo a = new AnnouncementVo();
        BeanCopyUtil.copyProperties(announcementVo,a);
        announcementDao.updateAnnounceManageTimeLiness(a);
        return announcementVo;
    }
//修改
    @Override
    public AnnouncementVo updateAnnounceManage(AnnouncementVo announcementVo) {
        log.debug("修改成功");
        announcementVo.setUpdatetime(new Date());
        announcementVo.setAnnouncementtypeId(announcementVo.getAnnouncementtype().getAnnouncementtypeId());
        announcementDao.updateAnnounceManage(announcementVo);
        return announcementVo;
    }
    //    查询
    @Override
    public List<AnnouncementVo> selectfindByContent(String announcementContent) {
        log.debug("查询成功");
        return announcementDao.selectfindByAnnouncementContent(announcementContent);
    }
}
