package com.dao;

import com.bean.Filemanage;

public interface FilemanageMapper {
    int deleteByPrimaryKey(Integer fileId);

    int insert(Filemanage record);

    int insertSelective(Filemanage record);

    Filemanage selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(Filemanage record);

    int updateByPrimaryKey(Filemanage record);
}