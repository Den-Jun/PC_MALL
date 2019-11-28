package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcTpcJobTask;
import com.junbaobao.mapper.PcTpcJobTaskMapper;
import com.junbaobao.service.PcTpcJobTaskService;
@Service
public class PcTpcJobTaskServiceImpl implements PcTpcJobTaskService{

    @Resource
    private PcTpcJobTaskMapper pcTpcJobTaskMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcJobTaskMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcJobTask record) {
        return pcTpcJobTaskMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcJobTask record) {
        return pcTpcJobTaskMapper.insertSelective(record);
    }

    @Override
    public PcTpcJobTask selectByPrimaryKey(Long id) {
        return pcTpcJobTaskMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcJobTask record) {
        return pcTpcJobTaskMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcJobTask record) {
        return pcTpcJobTaskMapper.updateByPrimaryKey(record);
    }

}
