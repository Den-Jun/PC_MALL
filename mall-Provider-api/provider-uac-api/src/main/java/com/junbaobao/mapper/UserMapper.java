package com.junbaobao.mapper;

import com.junbaobao.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);
}