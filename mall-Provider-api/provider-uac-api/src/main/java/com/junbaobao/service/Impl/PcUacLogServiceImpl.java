package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcUacLogMapper;
import com.junbaobao.model.PcUacLog;
import com.junbaobao.service.PcUacLogService;
@Service
public class PcUacLogServiceImpl implements PcUacLogService{

    @Resource
    private PcUacLogMapper pcUacLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcUacLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcUacLog record) {
        return pcUacLogMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacLog record) {
        return pcUacLogMapper.insertSelective(record);
    }

    @Override
    public PcUacLog selectByPrimaryKey(Long id) {
        return pcUacLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcUacLog record) {
        return pcUacLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcUacLog record) {
        return pcUacLogMapper.updateByPrimaryKey(record);
    }

}
