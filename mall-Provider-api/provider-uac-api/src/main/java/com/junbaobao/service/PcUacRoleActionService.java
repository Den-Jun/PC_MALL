package com.junbaobao.service;

import com.junbaobao.model.PcUacRoleAction;
public interface PcUacRoleActionService{


    int deleteByPrimaryKey(Long roleId,Long actionId);

    int insert(PcUacRoleAction record);

    int insertSelective(PcUacRoleAction record);

}
