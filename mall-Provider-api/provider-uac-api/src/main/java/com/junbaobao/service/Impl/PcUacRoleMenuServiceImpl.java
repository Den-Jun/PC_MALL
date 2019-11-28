package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcUacRoleMenu;
import com.junbaobao.mapper.PcUacRoleMenuMapper;
import com.junbaobao.service.PcUacRoleMenuService;
@Service
public class PcUacRoleMenuServiceImpl implements PcUacRoleMenuService{

    @Resource
    private PcUacRoleMenuMapper pcUacRoleMenuMapper;

    @Override
    public int deleteByPrimaryKey(Long roleId,Long menuId) {
        return pcUacRoleMenuMapper.deleteByPrimaryKey(roleId,menuId);
    }

    @Override
    public int insert(PcUacRoleMenu record) {
        return pcUacRoleMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacRoleMenu record) {
        return pcUacRoleMenuMapper.insertSelective(record);
    }

}
