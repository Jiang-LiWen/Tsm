package com.trkj.tsm.service;

import com.trkj.tsm.vo.MemorandumattachmentVo;

import java.util.List;

public interface MemorandumattachmentService {
    //     招生未审核显示
    List<MemorandumattachmentVo> selectZSIsExamine();
    //     招生已审核显示
    List<MemorandumattachmentVo> selectZSIsExamineOver();
    //     显示
    List<MemorandumattachmentVo> selectMemorandumattachment();
    //     教务显示
    List<MemorandumattachmentVo> jwselectMemorandumattachment(String likelike1,String likelike2);
//    招生未审核
    MemorandumattachmentVo updateByZSIsExamine(MemorandumattachmentVo memorandumattachmentVo);
//    教务未审核
    MemorandumattachmentVo updateByJWIsExamine(MemorandumattachmentVo memorandumattachmentVo);
}
