package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.TrainingperiodDao;
import com.trkj.tsm.entity.Trainingperiod;
import com.trkj.tsm.service.TrainingperiodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class TrainingperiodServiceImpl implements TrainingperiodService {
    @Resource
    private TrainingperiodDao trainingperiodDao;

    @Override
    public List<Trainingperiod> selectTrainingperiodLike(String likelike) {
        log.debug("TrainingperiodService:模糊查询时段-----------------------------------------");
        return trainingperiodDao.selectTrainingperiodLike(likelike);
    }

    @Override
    public List<Trainingperiod> selectTrainingperiod() {
        log.debug("TrainingperiodService:根据时段找时段-----------------------------------------");
        return trainingperiodDao.selectTrainingperiod();
    }

    @Override
    public int updateTrainingperiod(Trainingperiod record) {
        log.debug("TrainingperiodService:修改时段-----------------------------------------");
        return trainingperiodDao.updateTrainingperiod(record);
    }

    @Override
    public int deleteTrainingperiod(Integer periodId) {
        log.debug("TrainingperiodService:删除时段-----------------------------------------");
        return trainingperiodDao.deleteTrainingperiod(periodId);
    }

    @Override
    public int insertTrainingperiod(Trainingperiod record) {
        log.debug("TrainingperiodService:添加时段-----------------------------------------");
        return trainingperiodDao.insertTrainingperiod(record);
    }
}
