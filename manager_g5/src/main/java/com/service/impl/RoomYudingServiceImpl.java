package com.service.impl;

import com.bean.RoomYuding;
import com.dao.RoomYudingMapper;
import com.service.RoomYudingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomYudingServiceImpl implements RoomYudingService {

    @Autowired
    private RoomYudingMapper roomYudingMapper;

    @Override
    public int deleteByPrimaryKey(Integer ydId) {
        return 0;
    }

    @Override
    public int insert(RoomYuding record) {
        return 0;
    }

    @Override
    public int insertSelective(RoomYuding record) {
        return 0;
    }

    @Override
    public RoomYuding selectByPrimaryKey(Integer ydId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(RoomYuding record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(RoomYuding record) {
        return 0;
    }
}