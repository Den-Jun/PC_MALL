package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.DatabasechangelogMapper;
import com.junbaobao.model.Databasechangelog;
import com.junbaobao.service.DatabasechangelogService;
@Service
public class DatabasechangelogServiceImpl implements DatabasechangelogService{

    @Resource
    private DatabasechangelogMapper databasechangelogMapper;

    @Override
    public int insert(Databasechangelog record) {
        return databasechangelogMapper.insert(record);
    }

    @Override
    public int insertSelective(Databasechangelog record) {
        return databasechangelogMapper.insertSelective(record);
    }

}
