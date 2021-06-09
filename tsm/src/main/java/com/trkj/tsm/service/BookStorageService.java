package com.trkj.tsm.service;

import com.trkj.tsm.entity.Book;
import com.trkj.tsm.entity.Bookstorage;
import com.trkj.tsm.vo.BookstorageVo;

import java.util.List;

public interface BookStorageService {
    List<Bookstorage> selectAllsdd();

    int addBookstorage(BookstorageVo bookstorageVo);

    Bookstorage updateByPrimaryKey(Bookstorage bookstorage);

    int deleteByPrimaryKey(int mbookstorageId);



}
