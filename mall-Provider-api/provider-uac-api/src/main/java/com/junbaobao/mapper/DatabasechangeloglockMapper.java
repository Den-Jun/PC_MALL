package com.junbaobao.mapper;

import com.junbaobao.model.Databasechangeloglock;

public interface DatabasechangeloglockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Databasechangeloglock record);

    int insertSelective(Databasechangeloglock record);

    Databasechangeloglock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Databasechangeloglock record);

    int updateByPrimaryKey(Databasechangeloglock record);
}