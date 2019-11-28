package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcUacGroupUser;
import com.junbaobao.mapper.PcUacGroupUserMapper;
import com.junbaobao.service.PcUacGroupUserService;
@Service
public class PcUacGroupUserServiceImpl implements PcUacGroupUserService{

    @Resource
    private PcUacGroupUserMapper pcUacGroupUserMapper;

    @Override
    public int insert(PcUacGroupUser record) {
        return pcUacGroupUserMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacGroupUser record) {
        return pcUacGroupUserMapper.insertSelective(record);
    }

}
