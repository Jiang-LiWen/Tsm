package com.trkj.tsm.dao;

import com.trkj.tsm.entity.Bookstorage;
import com.trkj.tsm.entity.Systemtype;
import com.trkj.tsm.vo.BookstorageVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookstorageDao {

    int deleteByPrimaryKey(Integer mbookstorageId);

    int insert(Bookstorage record);

    //增加
    int insertSelective(BookstorageVo record);

    Bookstorage selectByPrimaryKey(Integer mbookstorageId);

    List<Bookstorage> selectByPrimaryKey1(String systemtypeName);

    int updateByPrimaryKeySelective(Bookstorage record);

    int updateByPrimaryKey(Bookstorage record);

    List<Bookstorage> selectAllsdd();

    int addBookstorage(Bookstorage record);


}