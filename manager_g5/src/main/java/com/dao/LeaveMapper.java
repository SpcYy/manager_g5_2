package com.dao;

import com.bean.Leave;

public interface LeaveMapper {
    int deleteByPrimaryKey(Integer leId);

    int insert(Leave record);

    int insertSelective(Leave record);

    Leave selectByPrimaryKey(Integer leId);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
}