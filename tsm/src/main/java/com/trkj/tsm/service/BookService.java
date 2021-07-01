package com.trkj.tsm.service;


import com.trkj.tsm.entity.Book;
import com.trkj.tsm.vo.BookVo;

import java.util.List;

public interface BookService {
    List<Book> selectAlls1();

    BookVo addbook(BookVo bookVo);

    List<Book> selectBook(String bookname);

    BookVo selectByPrimaryKey(Integer bookId);

    List<BookVo> selectByPrimaryKeyyyyy(BookVo bookVo);

    List<Book> selsebook();

    Book updateBook(Book book);
}
