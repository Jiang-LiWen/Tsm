package com.trkj.tsm.service;

import com.trkj.tsm.vo.DailLogReplyVo;

import java.util.List;

public interface DailLogReplyService {
    List<DailLogReplyVo> selectByPrimaryKey();//查看

    DailLogReplyVo insert(DailLogReplyVo dailLogReplyVo);

    DailLogReplyVo updateDaillogreply(DailLogReplyVo dailLogReplyVo);//修改
}
