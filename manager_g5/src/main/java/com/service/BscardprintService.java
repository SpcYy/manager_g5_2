package com.service;

import com.bean.Bscardprint;

public interface BscardprintService {
    int deleteByPrimaryKey(Integer bscardId);

    int insert(Bscardprint record);

    int insertSelective(Bscardprint record);

    Bscardprint selectByPrimaryKey(Integer bscardId);

    int updateByPrimaryKeySelective(Bscardprint record);

    int updateByPrimaryKey(Bscardprint record);
}