package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Trainingperiod;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainingperiodDao {

    List<Trainingperiod> selectTrainingperiodLike(String likelike);//模糊查询时段

    List<Trainingperiod> selectTrainingperiod();//根据时段找时段

    int updateTrainingperiod(Trainingperiod record);//修改时段

    int deleteTrainingperiod(Integer periodId);//删除时段

    int insertTrainingperiod(Trainingperiod record);//添加时段

}