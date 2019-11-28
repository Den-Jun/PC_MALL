package com.junbaobao.mapper;

import com.junbaobao.model.PcUacRoleAction;
import org.apache.ibatis.annotations.Param;

public interface PcUacRoleActionMapper {
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("actionId") Long actionId);

    int insert(PcUacRoleAction record);

    int insertSelective(PcUacRoleAction record);
}