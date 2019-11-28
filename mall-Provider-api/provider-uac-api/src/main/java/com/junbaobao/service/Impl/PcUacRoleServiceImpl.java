package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacRoleMapper;
import com.junbaobao.model.PcUacRole;
import com.junbaobao.service.PcUacRoleService;
@Service
public class PcUacRoleServiceImpl implements PcUacRoleService{

    @Resource
    private PcUacRoleMapper pcUacRoleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcUacRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcUacRole record) {
        return pcUacRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacRole record) {
        return pcUacRoleMapper.insertSelective(record);
    }

    @Override
    public PcUacRole selectByPrimaryKey(Long id) {
        return pcUacRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcUacRole record) {
        return pcUacRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcUacRole record) {
        return pcUacRoleMapper.updateByPrimaryKey(record);
    }

}
