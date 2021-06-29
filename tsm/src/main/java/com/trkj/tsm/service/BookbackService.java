package com.trkj.tsm.service;



import com.trkj.tsm.entity.Bookback;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface BookbackService {
    List<Bookback> selectAll();

    int deleteByPrimaryKey(int bookbackId);

    Bookback insert(Bookback bookback);

    List<Bookback> selectBookBack(@Param("value")String value, @Param("input") String input);
}
