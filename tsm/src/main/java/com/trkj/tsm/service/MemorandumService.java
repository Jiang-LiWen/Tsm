package com.trkj.tsm.service;

import com.trkj.tsm.vo.MemorandumVo;

import java.util.List;

public interface MemorandumService {
    List<MemorandumVo> selectByPrimaryKey();//查看
    int deleteMemorandum(Integer memorandumid);//删除
    MemorandumVo addMemorandum(MemorandumVo memorandumVo);//新增
    MemorandumVo updataMemorandum(MemorandumVo memorandumVo);//修改

}
