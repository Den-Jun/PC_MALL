package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.mapper.PcOpcSmsSettingMapper;
import com.junbaobao.model.PcOpcSmsSetting;
import com.junbaobao.service.PcOpcSmsSettingService;
@Service
public class PcOpcSmsSettingServiceImpl implements PcOpcSmsSettingService{

    @Resource
    private PcOpcSmsSettingMapper pcOpcSmsSettingMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcOpcSmsSettingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcOpcSmsSetting record) {
        return pcOpcSmsSettingMapper.insert(record);
    }

    @Override
    public int insertSelective(PcOpcSmsSetting record) {
        return pcOpcSmsSettingMapper.insertSelective(record);
    }

    @Override
    public PcOpcSmsSetting selectByPrimaryKey(Long id) {
        return pcOpcSmsSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcOpcSmsSetting record) {
        return pcOpcSmsSettingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcOpcSmsSetting record) {
        return pcOpcSmsSettingMapper.updateByPrimaryKey(record);
    }

}
