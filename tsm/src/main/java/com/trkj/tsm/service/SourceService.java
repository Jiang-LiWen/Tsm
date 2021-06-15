package com.trkj.tsm.service;

import com.trkj.tsm.vo.AnnouncementVo;
import com.trkj.tsm.vo.SourceVo;

import java.util.List;

public interface SourceService {
//    显示所有
    List<SourceVo> selectfindSourceAll();
//    添加生源渠道
    SourceVo insertSource(SourceVo sourceVo);
//    修改生源渠道名称
    SourceVo updateSource(SourceVo sourceVo);
//    删除生源渠道
    SourceVo updateSourceTimeLiness(SourceVo sourceVo);
//    查询生源渠道
    List<SourceVo> selectSourceName(String sourceName);

}
