package com.trkj.tsm.service;

import com.trkj.tsm.entity.Enterprise;
import com.trkj.tsm.vo.EnterpriseVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface EnterpriseService {
    List<EnterpriseVo> selectfinds();

    List<EnterpriseVo> selectfindss();

    List<EnterpriseVo> selectEnterprise(String likeke);

    EnterpriseVo addEnterprise(EnterpriseVo enterpriseVo);

    EnterpriseVo updateEnterprise(EnterpriseVo enterpriseVo);

    int deleteEnterprise(Integer enterpriseId);

//    EnterpriseVo selectEnterprise(Integer enterpriseId);
}
