package com.trkj.tsm.service;

import com.trkj.tsm.entity.Book;
import com.trkj.tsm.entity.Bookstorage;
import com.trkj.tsm.entity.Classroom;
import com.trkj.tsm.vo.BookstorageVo;
import com.trkj.tsm.vo.ClassroomVo;

import java.util.List;

public interface BookStorageService {
    List<BookstorageVo> selectAllsdd(String flag);

    int addBookstorage(BookstorageVo bookstorageVo);

    BookstorageVo updateByPrimaryKeyw(BookstorageVo bookstorageVo);

}
