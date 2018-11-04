package com.service.impl;

import com.bean.Renwu;
import com.dao.RenwuMapper;
import com.service.RenwuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RenwuServiceImpl implements RenwuService {

    @Autowired
    private RenwuMapper renwuMapper;

    @Override
    public int deleteByPrimaryKey(Integer rwId) {
        return 0;
    }

    @Override
    public int insert(Renwu record) {
        return 0;
    }

    @Override
    public int insertSelective(Renwu record) {
        return 0;
    }

    @Override
    public Renwu selectByPrimaryKey(Integer rwId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Renwu record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Renwu record) {
        return 0;
    }
}