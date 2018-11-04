package com.service.impl;

import com.bean.Car;
import com.dao.CarMapper;
import com.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Car record) {
        return 0;
    }

    @Override
    public int insertSelective(Car record) {
        return 0;
    }

    @Override
    public Car selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Car record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Car record) {
        return 0;
    }
}