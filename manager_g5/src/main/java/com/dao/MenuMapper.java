package com.dao;

import com.bean.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}