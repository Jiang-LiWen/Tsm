package com.trkj.tsm.dao;

import com.trkj.tsm.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserRoleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRole sysUserRole);

    SysUserRole insertSelective(SysUserRole sysUserRole);

    SysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserRole record);

    int updateByPrimaryKey(SysUserRole sysUserRole);
}