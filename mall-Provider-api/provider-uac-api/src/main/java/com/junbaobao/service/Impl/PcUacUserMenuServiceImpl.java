package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacUserMenuMapper;
import com.junbaobao.model.PcUacUserMenu;
import com.junbaobao.service.PcUacUserMenuService;
@Service
public class PcUacUserMenuServiceImpl implements PcUacUserMenuService{

    @Resource
    private PcUacUserMenuMapper pcUacUserMenuMapper;

    @Override
    public int insert(PcUacUserMenu record) {
        return pcUacUserMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacUserMenu record) {
        return pcUacUserMenuMapper.insertSelective(record);
    }

}
