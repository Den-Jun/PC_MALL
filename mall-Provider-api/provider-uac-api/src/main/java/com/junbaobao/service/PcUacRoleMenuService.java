package com.junbaobao.service;

import com.junbaobao.model.PcUacRoleMenu;
public interface PcUacRoleMenuService{


    int deleteByPrimaryKey(Long roleId,Long menuId);

    int insert(PcUacRoleMenu record);

    int insertSelective(PcUacRoleMenu record);

}
