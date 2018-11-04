package com.service.impl;

import com.bean.Leave;
import com.dao.LeaveMapper;
import com.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveMapper leaveMapper;

    @Override
    public int deleteByPrimaryKey(Integer leId) {
        return 0;
    }

    @Override
    public int insert(Leave record) {
        return 0;
    }

    @Override
    public int insertSelective(Leave record) {
        return 0;
    }

    @Override
    public Leave selectByPrimaryKey(Integer leId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Leave record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Leave record) {
        return 0;
    }
}