package com.service;

import com.bean.RoomYuding;

public interface RoomYudingService {
    int deleteByPrimaryKey(Integer ydId);

    int insert(RoomYuding record);

    int insertSelective(RoomYuding record);

    RoomYuding selectByPrimaryKey(Integer ydId);

    int updateByPrimaryKeySelective(RoomYuding record);

    int updateByPrimaryKey(RoomYuding record);
}