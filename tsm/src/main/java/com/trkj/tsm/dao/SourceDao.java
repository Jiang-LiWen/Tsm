package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Source;
import com.trkj.tsm.vo.SourceVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SourceDao {
// 添加生源信息
    int insertSource(SourceVo record);

//显示生源信息
    List<SourceVo> selectfindSourceAll();

// 修改生源渠道名称
    int updateSource(SourceVo record);

//    删除生源渠道
    int updateSourceTimeLiness (SourceVo sourceVo);
//    查询生源渠道
    List<SourceVo> selectSourceName(String sourceName);
}