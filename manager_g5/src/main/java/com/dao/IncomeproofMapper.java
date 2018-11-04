package com.dao;

import com.bean.Incomeproof;

public interface IncomeproofMapper {
    int deleteByPrimaryKey(Integer incomeId);

    int insert(Incomeproof record);

    int insertSelective(Incomeproof record);

    Incomeproof selectByPrimaryKey(Integer incomeId);

    int updateByPrimaryKeySelective(Incomeproof record);

    int updateByPrimaryKey(Incomeproof record);
}