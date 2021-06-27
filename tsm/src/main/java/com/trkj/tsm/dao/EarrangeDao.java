package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Earrange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EarrangeDao {
    int deleteEarrangeById(Integer earrangeId);//根据Id删除预排课内容

    int insertEarrange(Earrange record);//添加预排课内容

    List<Earrange> selectAllEarrange();//查找所有预排课内容

}