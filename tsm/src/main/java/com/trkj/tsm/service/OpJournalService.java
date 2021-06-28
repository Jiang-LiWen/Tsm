package com.trkj.tsm.service;

import com.trkj.tsm.entity.Opjournal;

import java.util.List;

public interface OpJournalService {
    int addOpJournal(Opjournal opjournal);
    List<Opjournal> selectOpjournal();
}
