package com.trkj.tsm.service.impl;

import com.trkj.tsm.dao.SuggestDao;
import com.trkj.tsm.service.SuggestService;
import com.trkj.tsm.vo.SuggestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class SuggestServiceImpl implements SuggestService {
    @Autowired
    private SuggestDao suggestDao;
    @Override
    public List<SuggestVo> selectByPrimaryKey() {
        return suggestDao.selectByPrimaryKey();
    }
}
