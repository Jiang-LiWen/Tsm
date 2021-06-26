package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Book;
import com.trkj.tsm.vo.BookVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {


    int insert(BookVo record);

    int insertSelective(Book record);

    List<Book> selectByPrimaryKey1(String bookname);

    BookVo selectByPrimaryKey(Integer bookId);

    List<BookVo> selectByPrimaryKeyyyyy(BookVo bookVo);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(BookVo record);

    List<Book> selectAlls1();
}