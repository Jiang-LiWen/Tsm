package com.trkj.tsm.service;

import com.trkj.tsm.entity.Bookdelivery;
import com.trkj.tsm.vo.BookdeliveryVo;

import java.util.List;

public interface BookDeliveryService {

    List<Bookdelivery> selectAllsss(String flag);


    BookdeliveryVo updateByPrimaryKeymmx(BookdeliveryVo bookdeliveryVo);

    Bookdelivery insertSelectivessb(Bookdelivery bookdelivery);
}
