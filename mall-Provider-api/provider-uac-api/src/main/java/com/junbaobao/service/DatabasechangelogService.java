package com.junbaobao.service;

import com.junbaobao.model.Databasechangelog;
public interface DatabasechangelogService{


    int insert(Databasechangelog record);

    int insertSelective(Databasechangelog record);

}
