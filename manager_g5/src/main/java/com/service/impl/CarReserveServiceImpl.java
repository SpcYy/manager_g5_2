package com.service.impl;

import com.bean.CarReserve;
import com.dao.CarReserveMapper;
import com.service.CarReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarReserveServiceImpl implements CarReserveService {

    @Autowired
    private CarReserveMapper carReserveMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(CarReserve record) {
        return 0;
    }

    @Override
    public int insertSelective(CarReserve record) {
        return 0;
    }

    @Override
    public CarReserve selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CarReserve record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CarReserve record) {
        return 0;
    }
}