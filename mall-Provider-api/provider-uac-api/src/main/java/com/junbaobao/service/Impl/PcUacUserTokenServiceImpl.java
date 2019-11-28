package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacUserTokenMapper;
import com.junbaobao.model.PcUacUserToken;
import com.junbaobao.service.PcUacUserTokenService;
@Service
public class PcUacUserTokenServiceImpl implements PcUacUserTokenService{

    @Resource
    private PcUacUserTokenMapper pcUacUserTokenMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcUacUserTokenMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcUacUserToken record) {
        return pcUacUserTokenMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacUserToken record) {
        return pcUacUserTokenMapper.insertSelective(record);
    }

    @Override
    public PcUacUserToken selectByPrimaryKey(Long id) {
        return pcUacUserTokenMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcUacUserToken record) {
        return pcUacUserTokenMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcUacUserToken record) {
        return pcUacUserTokenMapper.updateByPrimaryKey(record);
    }

}
