package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcUacRoleAction;
import com.junbaobao.mapper.PcUacRoleActionMapper;
import com.junbaobao.service.PcUacRoleActionService;
@Service
public class PcUacRoleActionServiceImpl implements PcUacRoleActionService{

    @Resource
    private PcUacRoleActionMapper pcUacRoleActionMapper;

    @Override
    public int deleteByPrimaryKey(Long roleId,Long actionId) {
        return pcUacRoleActionMapper.deleteByPrimaryKey(roleId,actionId);
    }

    @Override
    public int insert(PcUacRoleAction record) {
        return pcUacRoleActionMapper.insert(record);
    }

    @Override
    public int insertSelective(PcUacRoleAction record) {
        return pcUacRoleActionMapper.insertSelective(record);
    }

}
