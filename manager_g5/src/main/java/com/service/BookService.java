package com.service;

import com.bean.Book;

public interface BookService {
    int deleteByPrimaryKey(String bookid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(String bookid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}