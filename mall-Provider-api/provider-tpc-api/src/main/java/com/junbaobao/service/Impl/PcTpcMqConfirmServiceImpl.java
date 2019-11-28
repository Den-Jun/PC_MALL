package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcTpcMqConfirm;
import com.junbaobao.mapper.PcTpcMqConfirmMapper;
import com.junbaobao.service.PcTpcMqConfirmService;
@Service
public class PcTpcMqConfirmServiceImpl implements PcTpcMqConfirmService{

    @Resource
    private PcTpcMqConfirmMapper pcTpcMqConfirmMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcTpcMqConfirmMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcTpcMqConfirm record) {
        return pcTpcMqConfirmMapper.insert(record);
    }

    @Override
    public int insertSelective(PcTpcMqConfirm record) {
        return pcTpcMqConfirmMapper.insertSelective(record);
    }

    @Override
    public PcTpcMqConfirm selectByPrimaryKey(Long id) {
        return pcTpcMqConfirmMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcTpcMqConfirm record) {
        return pcTpcMqConfirmMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcTpcMqConfirm record) {
        return pcTpcMqConfirmMapper.updateByPrimaryKey(record);
    }

}
