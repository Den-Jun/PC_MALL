package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacRoleUserMapper;
import com.junbaobao.model.PcUacRoleUser;
import com.junbaobao.service.PcUacRoleUserService;
@Service
public class PcUacRoleUserServiceImpl implements PcUacRoleUserService{

    @Resource
    private PcUacRoleUserMapper pcUacRoleUserMapper;

    @Override
    public int deleteByPrimaryKey(Long roleId,Long userId) {
        return pcUacRoleUserMapper.deleteByPrimaryKey(roleId,userId);
    }

    @Override
    public int insert(PcUacRoleUser record) {
        return pcUacRoleUserMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacRoleUser record) {
        return pcUacRoleUserMapper.insertSelective(record);
    }

}
