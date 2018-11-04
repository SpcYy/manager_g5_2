package com.service.impl;

import com.bean.Log;
import com.dao.LogMapper;
import com.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Log record) {
        return 0;
    }

    @Override
    public int insertSelective(Log record) {
        return 0;
    }

    @Override
    public Log selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Log record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Log record) {
        return 0;
    }
}