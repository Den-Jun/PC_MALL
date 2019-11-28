package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacGroupMapper;
import com.junbaobao.model.PcUacGroup;
import com.junbaobao.service.PcUacGroupService;
@Service
public class PcUacGroupServiceImpl implements PcUacGroupService{

    @Resource
    private PcUacGroupMapper pcUacGroupMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcUacGroupMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcUacGroup record) {
        return pcUacGroupMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacGroup record) {
        return pcUacGroupMapper.insertSelective(record);
    }

    @Override
    public PcUacGroup selectByPrimaryKey(Long id) {
        return pcUacGroupMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcUacGroup record) {
        return pcUacGroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcUacGroup record) {
        return pcUacGroupMapper.updateByPrimaryKey(record);
    }

}
