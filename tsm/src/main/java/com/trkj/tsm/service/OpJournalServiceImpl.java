package com.trkj.tsm.service;

import com.trkj.tsm.dao.OpjournalDao;
import com.trkj.tsm.entity.Opjournal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpJournalServiceImpl implements OpJournalService {
    @Autowired
    private OpjournalDao opjournalDao;
    @Override
    public int addOpJournal(Opjournal opjournal) {
        return opjournalDao.insert(opjournal);
    }

    @Override
    public List<Opjournal> selectOpjournal() {

        return opjournalDao.selectOpjournal();
    }
}
