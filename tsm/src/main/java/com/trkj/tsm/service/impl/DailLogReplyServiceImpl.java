package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.DaillogreplyDao;
import com.trkj.tsm.entity.Daillogreply;
import com.trkj.tsm.service.DailLogReplyService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.DailLogReplyVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DailLogReplyServiceImpl implements DailLogReplyService {
    @Autowired
    private DaillogreplyDao daillogreplyDao;

    @Override
    public List<DailLogReplyVo> selectByPrimaryKey() {

        return daillogreplyDao.selectByPrimaryKey();

    }

    @Override
    public DailLogReplyVo insert(DailLogReplyVo dailLogReplyVo) {
        log.debug("新增工作交接表");
        daillogreplyDao.insert(dailLogReplyVo);
        return dailLogReplyVo;
    }

    @Override
    public DailLogReplyVo updateDaillogreply(DailLogReplyVo dailLogReplyVo) {
        log.debug("修改回复表信息");
        Daillogreply d = new Daillogreply();
        BeanCopyUtil.copyProperties(dailLogReplyVo, d);
        daillogreplyDao.updateByPrimaryKey(d);
        return dailLogReplyVo;
    }


}
