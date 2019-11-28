package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.User;
import com.junbaobao.mapper.UserMapper;
import com.junbaobao.service.UserService;
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

}
