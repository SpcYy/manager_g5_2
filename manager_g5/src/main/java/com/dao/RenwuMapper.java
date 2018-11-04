package com.dao;

import com.bean.Renwu;

public interface RenwuMapper {
    int deleteByPrimaryKey(Integer rwId);

    int insert(Renwu record);

    int insertSelective(Renwu record);

    Renwu selectByPrimaryKey(Integer rwId);

    int updateByPrimaryKeySelective(Renwu record);

    int updateByPrimaryKey(Renwu record);
}