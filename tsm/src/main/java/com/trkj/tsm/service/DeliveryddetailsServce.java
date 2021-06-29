package com.trkj.tsm.service;

import com.trkj.tsm.entity.Deliveryddetails;


import java.util.List;

public interface DeliveryddetailsServce {
    List<Deliveryddetails> selectAllssss(String flag);
    //修改
    Deliveryddetails updateByPrimaryKeymmc(Deliveryddetails deliveryddetails);

    Deliveryddetails insertSelectivehhp(Deliveryddetails deliveryddetails);
}
