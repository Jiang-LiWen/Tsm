package com.trkj.tsm.service.serviceImpI;

import com.trkj.tsm.dao.ReturnvisitDao;
import com.trkj.tsm.service.ReturnvisitService;
import com.trkj.tsm.util.BeanCopyUtil;
import com.trkj.tsm.vo.RegisterVo;
import com.trkj.tsm.vo.ReturnvisitVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@RestController
@Slf4j
public class ReturnvisitServiceImpl implements ReturnvisitService {
    @Resource
    private ReturnvisitDao returnvisitDao;
    @Override
//    根据生源渠道id显示
    public List<ReturnvisitVo> selectReturnVisit(Integer registerId) {
        log.debug("点击回访显示对应生源渠道id(ImpI)");
        return returnvisitDao.selectReturnVisit(registerId);
    }
    //增加回访记录
    @Override
    public ReturnvisitVo insertReturnvisit(ReturnvisitVo returnvisitVo) {
        log.debug("咨询登记添加成功");
        log.debug(returnvisitVo.toString());
        returnvisitDao.insertReturnvisit(returnvisitVo);
        return returnvisitVo;
    }

    @Override
    public ReturnvisitVo updateReturnVisitTimeLiness(ReturnvisitVo returnvisitVo) {
        log.debug("删除成功(时效性修改成功)ImpI");
        ReturnvisitVo r = new ReturnvisitVo();
        BeanCopyUtil.copyProperties(returnvisitVo,r);
        returnvisitDao.updateReturnVisitTimeLiness(r);
        return returnvisitVo;
    }


}
