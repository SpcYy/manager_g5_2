package com.service.impl;

import com.bean.Tongzhi;
import com.dao.TongzhiMapper;
import com.service.TongzhiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TongzhiServiceImpl implements TongzhiService {

    @Autowired
    private TongzhiMapper tongzhiMapper;

    @Override
    public int deleteByPrimaryKey(Integer tzId) {
        return 0;
    }

    @Override
    public int insert(Tongzhi record) {
        return 0;
    }

    @Override
    public int insertSelective(Tongzhi record) {
        return 0;
    }

    @Override
    public Tongzhi selectByPrimaryKey(Integer tzId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Tongzhi record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Tongzhi record) {
        return 0;
    }
}