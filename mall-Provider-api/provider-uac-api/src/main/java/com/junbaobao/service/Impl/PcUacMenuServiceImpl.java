package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacMenuMapper;
import com.junbaobao.model.PcUacMenu;
import com.junbaobao.service.PcUacMenuService;
@Service
public class PcUacMenuServiceImpl implements PcUacMenuService{

    @Resource
    private PcUacMenuMapper pcUacMenuMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcUacMenuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcUacMenu record) {
        return pcUacMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacMenu record) {
        return pcUacMenuMapper.insertSelective(record);
    }

    @Override
    public PcUacMenu selectByPrimaryKey(Long id) {
        return pcUacMenuMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcUacMenu record) {
        return pcUacMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcUacMenu record) {
        return pcUacMenuMapper.updateByPrimaryKey(record);
    }

}
