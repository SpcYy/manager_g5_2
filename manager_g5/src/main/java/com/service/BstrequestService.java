package com.service;

import com.bean.Bstrequest;

public interface BstrequestService {
    int deleteByPrimaryKey(Integer bstreqId);

    int insert(Bstrequest record);

    int insertSelective(Bstrequest record);

    Bstrequest selectByPrimaryKey(Integer bstreqId);

    int updateByPrimaryKeySelective(Bstrequest record);

    int updateByPrimaryKeyWithBLOBs(Bstrequest record);

    int updateByPrimaryKey(Bstrequest record);
}