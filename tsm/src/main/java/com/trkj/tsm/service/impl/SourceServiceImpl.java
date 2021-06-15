package com.trkj.tsm.service.serviceImpI;

import com.trkj.tsm.dao.SourceDao;
import com.trkj.tsm.service.SourceService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.SourceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
public class SourceServiceImpl implements SourceService {
    @Resource
    private SourceDao sourceDao;
//    显示所有生源渠道信息
    @Override
    public List<SourceVo> selectfindSourceAll() {
        log.debug("===================显示所有========================");
        return sourceDao.selectfindSourceAll();
    }
//      添加生源渠道信息
    @Override
    public SourceVo insertSource(SourceVo sourceVo) {
        log.debug("====================添加生源渠道信息================");
        sourceDao.insertSource(sourceVo);
        return sourceVo;
    }

    @Override
    public SourceVo updateSource(SourceVo sourceVo) {
        log.debug("======================修改生源渠道=============");
        sourceVo.setLastupdatetime(new Date());
        sourceDao.updateSource(sourceVo);
        return sourceVo;
    }

    @Override
    public SourceVo updateSourceTimeLiness(SourceVo sourceVo) {
        log.debug("删除成功");
        SourceVo s = new SourceVo();
        BeanCopyUtil.copyProperties(sourceVo,s);
        sourceDao.updateSourceTimeLiness(s);
        return sourceVo;
    }

    @Override
    public List<SourceVo> selectSourceName(String sourceName) {
        log.debug("查询成功");
        return sourceDao.selectSourceName(sourceName);
    }
}
