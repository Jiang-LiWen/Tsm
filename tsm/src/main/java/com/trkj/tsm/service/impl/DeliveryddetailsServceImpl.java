package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.DeliveryddetailsDao;
import com.trkj.tsm.entity.Deliveryddetails;
import com.trkj.tsm.service.DeliveryddetailsServce;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.BookdeliveryVo;
import com.trkj.tsm.vo.BookstorageVo;
import com.trkj.tsm.vo.DeliveryddetailsVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class DeliveryddetailsServceImpl implements DeliveryddetailsServce {
    @Resource
    private DeliveryddetailsDao deliveryddetailsDao;



    @Override
    public List<Deliveryddetails> selectAllssss(String flag) {

        log.debug("分页查询所有");
        return deliveryddetailsDao.selectAllssss(flag);
    }

    @Override
    public Deliveryddetails updateByPrimaryKeymmc(Deliveryddetails deliveryddetails) {
            log.debug("修改到了");
            log.debug(deliveryddetails+toString()+"0000000000000000000000000000000");
            /*deliveryddetails.setTimeliness(1);*/
            Deliveryddetails d = new Deliveryddetails();
            BeanCopyUtil.copyProperties(deliveryddetails, d);
            deliveryddetailsDao.updateByPrimaryKeymmc(d);
            return deliveryddetails;

    }

    @Override
    public Deliveryddetails insertSelectivehhp(Deliveryddetails deliveryddetails) {
        log.debug("新增信息");
        deliveryddetails.setEmpId(1);
 /*       Deliveryddetails d = new Deliveryddetails();
        BeanCopyUtil.copyProperties(deliveryddetails, d);*/
        deliveryddetailsDao.insertSelectivehhp(deliveryddetails);
        return deliveryddetails;
    }


}
