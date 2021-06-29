package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Bookdelivery;
import com.trkj.tsm.entity.Deliveryddetails;
import com.trkj.tsm.vo.DeliveryddetailsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeliveryddetailsDao {
    int deleteByPrimaryKey(Integer deliveryddetailsId);

    int insertSelecti(DeliveryddetailsVo record);

    int insertSelectivehhp(Deliveryddetails record);

    DeliveryddetailsVo selectByPrimaryKey(Integer deliveryddetailsId);

    int updateByPrimaryKeySelective(DeliveryddetailsVo record);

    //修改
    int updateByPrimaryKeymmc(Deliveryddetails deliveryddetails);

    List<Deliveryddetails> selectAllssss(String flag);
}