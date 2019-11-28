package com.junbaobao.service;

import com.junbaobao.model.Databasechangeloglock;
public interface DatabasechangeloglockService{


    int deleteByPrimaryKey(Integer id);

    int insert(Databasechangeloglock record);

    int insertSelective(Databasechangeloglock record);

    Databasechangeloglock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Databasechangeloglock record);

    int updateByPrimaryKey(Databasechangeloglock record);

}
