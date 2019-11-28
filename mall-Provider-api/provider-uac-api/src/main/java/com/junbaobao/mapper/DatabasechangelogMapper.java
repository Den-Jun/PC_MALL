package com.junbaobao.mapper;

import com.junbaobao.model.Databasechangelog;

public interface DatabasechangelogMapper {
    int insert(Databasechangelog record);

    int insertSelective(Databasechangelog record);
}