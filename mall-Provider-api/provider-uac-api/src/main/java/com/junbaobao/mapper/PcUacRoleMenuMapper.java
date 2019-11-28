package com.junbaobao.mapper;

import com.junbaobao.model.PcUacRoleMenu;
import org.apache.ibatis.annotations.Param;

public interface PcUacRoleMenuMapper {
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("menuId") Long menuId);

    int insert(PcUacRoleMenu record);

    int insertSelective(PcUacRoleMenu record);
}