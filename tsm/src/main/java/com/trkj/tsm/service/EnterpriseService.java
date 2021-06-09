package com.trkj.tsm.service;

import com.trkj.tsm.entity.Enterprise;
import com.trkj.tsm.vo.EnterpriseVo;

import java.util.List;

public interface EnterpriseService {
    List<EnterpriseVo> selectfinds();

    EnterpriseVo addEnterprise(EnterpriseVo enterpriseVo);

    EnterpriseVo updateEnterprise(EnterpriseVo enterpriseVo);

    int deleteEnterprise(Integer enterpriseId);

    Enterprise selectEnterprise(Integer enterpriseId);

    List<EnterpriseVo> selectfindss();

    List<EnterpriseVo> selectEnterpriselike(String likeke);
}
