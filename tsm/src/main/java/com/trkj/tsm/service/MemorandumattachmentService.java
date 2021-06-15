package com.trkj.tsm.service;

import com.trkj.tsm.vo.MemorandumattachmentVo;

import java.util.List;

public interface MemorandumattachmentService {
    //     招生未审核显示
    List<MemorandumattachmentVo> selectZSIsExamine();
    //     教务未审核显示
    List<MemorandumattachmentVo> selectJWIsExamine();
    //     招生已审核显示
    List<MemorandumattachmentVo> selectZSIsExamineOver();
    //     教务已审核显示
    List<MemorandumattachmentVo> selectJWIsExamineOver();
    //     显示
    List<MemorandumattachmentVo> selectMemorandumattachment();
//    招生未审核
    MemorandumattachmentVo updateByZSIsExamine(MemorandumattachmentVo memorandumattachmentVo);
//    教务未审核
    MemorandumattachmentVo updateByJWIsExamine(MemorandumattachmentVo memorandumattachmentVo);
}
