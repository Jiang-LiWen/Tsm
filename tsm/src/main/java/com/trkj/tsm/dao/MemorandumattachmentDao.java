package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Memorandumattachment;
import com.trkj.tsm.vo.AnnouncementVo;
import com.trkj.tsm.vo.MemorandumattachmentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemorandumattachmentDao {
    //     招生未审核显示
    List<MemorandumattachmentVo> selectZSIsExamine();
    //     教务未审核显示
    List<MemorandumattachmentVo> selectJWIsExamine();
//     显示
    List<MemorandumattachmentVo> selectMemorandumattachment();
//    招生未审核
    int updateByZSIsExamine(MemorandumattachmentVo memorandumattachmentVo);
//    教务未审核
    int updateByJWIsExamine(MemorandumattachmentVo memorandumattachmentVo);
    //     招生已审核显示
    List<MemorandumattachmentVo> selectZSIsExamineOver();
    //     教务已审核显示
    List<MemorandumattachmentVo> selectJWIsExamineOver();
}