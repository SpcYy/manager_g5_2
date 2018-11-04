package com.service.impl;

import com.bean.Incomeproof;
import com.dao.IncomeproofMapper;
import com.service.IncomeproofService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeproofServiceImpl implements IncomeproofService {

    @Autowired
    private IncomeproofMapper incomeproofMapper;

    @Override
    public int insert(Incomeproof record) {
        return 0;
    }

    @Override
    public int insertSelective(Incomeproof record) {
        return 0;
    }
}