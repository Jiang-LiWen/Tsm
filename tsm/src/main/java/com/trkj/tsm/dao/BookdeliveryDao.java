package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Bookdelivery;
import com.trkj.tsm.vo.BookdeliveryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookdeliveryDao {
    int deleteByPrimaryKey(Integer bookdeliveryId);

    int insertSelecti(Bookdelivery record);

    //新增
    int insertSelectivessb(Bookdelivery record);

    int updateByPrimaryKeymmx(BookdeliveryVo bookdeliveryVo);

    int updateByPrimaryKeySelective(Bookdelivery record);

    int updateByPrimaryKey(Bookdelivery record);

    List<Bookdelivery> selectAllsss(String flag);

    List<Bookdelivery> selectByPrimaryKeyeery(String bookdeliveryName);

}