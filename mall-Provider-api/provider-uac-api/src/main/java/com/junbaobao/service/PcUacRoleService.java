package com.junbaobao.service;

import com.junbaobao.model.PcUacRole;
public interface PcUacRoleService{


    int deleteByPrimaryKey(Long id);

    int insert(PcUacRole record);

    int insertSelective(PcUacRole record);

    PcUacRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacRole record);

    int updateByPrimaryKey(PcUacRole record);

}
