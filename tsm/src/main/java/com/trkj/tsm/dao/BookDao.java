package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Book;
import com.trkj.tsm.vo.BookVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {
    int deleteByPrimaryKey(Integer bookId);

    int insert(BookVo record);

    int insertSelective(Book record);

    List<Book> selectByPrimaryKey(String bookname);

    BookVo selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(BookVo record);

    List<Book> selectAlls1();
}