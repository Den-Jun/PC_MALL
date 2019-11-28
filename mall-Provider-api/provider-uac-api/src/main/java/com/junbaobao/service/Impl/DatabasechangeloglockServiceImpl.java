package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.Databasechangeloglock;
import com.junbaobao.mapper.DatabasechangeloglockMapper;
import com.junbaobao.service.DatabasechangeloglockService;
@Service
public class DatabasechangeloglockServiceImpl implements DatabasechangeloglockService{

    @Resource
    private DatabasechangeloglockMapper databasechangeloglockMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return databasechangeloglockMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Databasechangeloglock record) {
        return databasechangeloglockMapper.insert(record);
    }

    @Override
    public int insertSelective(Databasechangeloglock record) {
        return databasechangeloglockMapper.insertSelective(record);
    }

    @Override
    public Databasechangeloglock selectByPrimaryKey(Integer id) {
        return databasechangeloglockMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Databasechangeloglock record) {
        return databasechangeloglockMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Databasechangeloglock record) {
        return databasechangeloglockMapper.updateByPrimaryKey(record);
    }

}
