package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacUserMapper;
import com.junbaobao.model.PcUacUser;
import com.junbaobao.service.PcUacUserService;
@Service
public class PcUacUserServiceImpl implements PcUacUserService{

    @Resource
    private PcUacUserMapper pcUacUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcUacUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcUacUser record) {
        return pcUacUserMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacUser record) {
        return pcUacUserMapper.insertSelective(record);
    }

    @Override
    public PcUacUser selectByPrimaryKey(Long id) {
        return pcUacUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcUacUser record) {
        return pcUacUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcUacUser record) {
        return pcUacUserMapper.updateByPrimaryKey(record);
    }

}
