package com.trkj.tsm.dao;


import com.trkj.tsm.entity.Enterprise;
import com.trkj.tsm.vo.EnterpriseVo;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.data.repository.CrudRepository;


import java.util.List;

@Mapper
public interface EnterpriseDao extends CrudRepository<EnterpriseDao,Long> {
    int deleteByPrimaryKey(Integer enterpriseId);

    int insert(Enterprise enterprise);

    EnterpriseVo selectByPrimaryKey(Integer enterpriseId);

    int updateByPrimaryKey(Enterprise enterprise);

    List<EnterpriseVo> selectfinds();

    List<EnterpriseVo> selectEnterprise(String likeke);

    List<EnterpriseVo> selectfindss();
}