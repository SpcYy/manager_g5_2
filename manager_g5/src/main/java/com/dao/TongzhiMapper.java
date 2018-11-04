package com.dao;

import com.bean.Tongzhi;

public interface TongzhiMapper {
    int deleteByPrimaryKey(Integer tzId);

    int insert(Tongzhi record);

    int insertSelective(Tongzhi record);

    Tongzhi selectByPrimaryKey(Integer tzId);

    int updateByPrimaryKeySelective(Tongzhi record);

    int updateByPrimaryKey(Tongzhi record);
}