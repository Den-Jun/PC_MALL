package com.junbaobao.service;

import com.junbaobao.model.PcUacRoleUser;
public interface PcUacRoleUserService{


    int deleteByPrimaryKey(Long roleId,Long userId);

    int insert(PcUacRoleUser record);

    int insertSelective(PcUacRoleUser record);

}
