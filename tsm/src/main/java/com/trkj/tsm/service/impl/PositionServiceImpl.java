package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.PositionDao;
import com.trkj.tsm.entity.Position;
import com.trkj.tsm.service.PositionService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.PositionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionDao positionDao;
    @Override
    public int deleteByPrimaryKey(Integer positionId) {
        return positionDao.deleteByPrimaryKey(positionId);
    }

    @Override
    public PositionVo insert(PositionVo positionVo) {
        Position p = new Position();
        BeanCopyUtil.copyProperties(positionVo,p);
        positionDao.insert(p);
        return positionVo;
    }

    @Override
    public PositionVo updateByPrimaryKey(PositionVo positionVo) {
        Position p = new Position();
        BeanCopyUtil.copyProperties(positionVo,p);
        positionDao.updateByPrimaryKey(p);
        return positionVo;
    }

    @Override
    public PositionVo updatePositionTimeliness(PositionVo positionVo) {
        Position p = new Position();
        BeanCopyUtil.copyProperties(positionVo,p);
        positionDao.updatePositionTimeliness(p);
        return positionVo;
    }

    @Override
    public List<PositionVo> selectPosition() {

        return positionDao.selectPosition();
    }

    @Override
    public List<PositionVo> selectPositions() {

        return positionDao.selectPositions();
    }
    @Override
    public List<PositionVo> selectPositionlike(String likeke) {

        return positionDao.selectPositionlike(likeke);
    }
}
