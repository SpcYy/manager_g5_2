package com.service;

import com.bean.Agency;

public interface AgencyService {
    int deleteByPrimaryKey(Integer agencyId);

    int insert(Agency record);

    int insertSelective(Agency record);

    Agency selectByPrimaryKey(Integer agencyId);

    int updateByPrimaryKeySelective(Agency record);

    int updateByPrimaryKey(Agency record);
}