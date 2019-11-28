package com.junbaobao.service;

import com.junbaobao.model.User;
public interface UserService{


    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

}
