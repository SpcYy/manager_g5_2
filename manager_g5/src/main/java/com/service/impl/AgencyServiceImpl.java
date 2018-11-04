package com.service.impl;

import com.bean.Agency;
import com.dao.AgencyMapper;
import com.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgencyServiceImpl implements AgencyService {

    @Autowired
    private AgencyMapper agencyMapper;

    @Override
    public int deleteByPrimaryKey(Integer agencyId) {
        return 0;
    }

    @Override
    public int insert(Agency record) {
        return 0;
    }

    @Override
    public int insertSelective(Agency record) {
        return 0;
    }

    @Override
    public Agency selectByPrimaryKey(Integer agencyId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Agency record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Agency record) {
        return 0;
    }
}