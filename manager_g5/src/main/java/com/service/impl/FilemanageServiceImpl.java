package com.service.impl;

import com.bean.Filemanage;
import com.dao.FilemanageMapper;
import com.service.FilemanageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilemanageServiceImpl implements FilemanageService {

    @Autowired
    private FilemanageMapper filemanageMapper;

    @Override
    public int deleteByPrimaryKey(Integer fileId) {
        return 0;
    }

    @Override
    public int insert(Filemanage record) {
        return 0;
    }

    @Override
    public int insertSelective(Filemanage record) {
        return 0;
    }

    @Override
    public Filemanage selectByPrimaryKey(Integer fileId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Filemanage record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Filemanage record) {
        return 0;
    }
}