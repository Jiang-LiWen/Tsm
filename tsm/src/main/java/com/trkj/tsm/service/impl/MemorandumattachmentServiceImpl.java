package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.MemorandumattachmentDao;
import com.trkj.tsm.service.MemorandumattachmentService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.MemorandumattachmentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@RestController
@Slf4j
public class MemorandumattachmentServiceImpl implements MemorandumattachmentService {
    @Resource
    private MemorandumattachmentDao memorandumattachmentDao;
//招生部未审核
    @Override
    public List<MemorandumattachmentVo> selectZSIsExamine() {
        log.debug("学员交接显示招生审核状态查询============================ImpI");
        return memorandumattachmentDao.selectZSIsExamine();
    }

    //招生部已审核
    @Override
    public List<MemorandumattachmentVo> selectZSIsExamineOver() {
        log.debug("学员交接显示招生审核状态查询============================ImpI");
        return memorandumattachmentDao.selectZSIsExamineOver();
    }

    //    显示
    @Override
    public List<MemorandumattachmentVo> selectMemorandumattachment() {
        log.debug("学员交接显示所有============================ImpI");
        return memorandumattachmentDao.selectMemorandumattachment();
    }

    //教务显示
    @Override
    public List<MemorandumattachmentVo> jwselectMemorandumattachment(String likelike1,String likelike2) {
        return memorandumattachmentDao.jwselectMemorandumattachment(likelike1,likelike2);
    }

    //招生审核
    @Override
    public MemorandumattachmentVo updateByZSIsExamine(MemorandumattachmentVo memorandumattachmentVo) {
        log.debug("招生审核通过===============================ImpI");
        MemorandumattachmentVo me = new MemorandumattachmentVo();
        BeanCopyUtil.copyProperties(memorandumattachmentVo,me);
        memorandumattachmentDao.updateByZSIsExamine(me);
        return memorandumattachmentVo;
    }
//教务审核
    @Override
    public MemorandumattachmentVo updateByJWIsExamine(MemorandumattachmentVo memorandumattachmentVo) {
        log.debug("教务审核通过===============================ImpI");
        MemorandumattachmentVo me = new MemorandumattachmentVo();
        BeanCopyUtil.copyProperties(memorandumattachmentVo,me);
        memorandumattachmentDao.updateByJWIsExamine(me);
        return memorandumattachmentVo;
    }
}
