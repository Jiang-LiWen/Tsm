package com.trkj.tsm.service;

import com.trkj.tsm.entity.Trainingperiod;

import java.util.List;

public interface TrainingperiodService {
    List<Trainingperiod> selectTrainingperiodLike(String likelike);//模糊查询时段

    List<Trainingperiod> selectTrainingperiod();//根据时段找时段

    int updateTrainingperiod(Trainingperiod record);//修改时段

    int deleteTrainingperiod(Integer periodId);//删除时段

    int insertTrainingperiod(Trainingperiod record);//添加时段
}
