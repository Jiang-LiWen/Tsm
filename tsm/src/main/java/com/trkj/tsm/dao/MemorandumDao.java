package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Memorandum;
import com.trkj.tsm.vo.MemorandumVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemorandumDao {
    int deleteByPrimaryKey(Integer memorandumId);//根据id删除

    int insert(Memorandum record);

    int insertSelective(Memorandum record);

    List<MemorandumVo> selectByPrimaryKey();//查询

//    List<MemorandumVo> selectMemorandum();

    int updateByPrimaryKeySelective(Memorandum record);

    int updateByPrimaryKey(Memorandum record);

    List<MemorandumVo> selectMemorandum(@Param("value11")String value11,@Param("value1")String value1);
}