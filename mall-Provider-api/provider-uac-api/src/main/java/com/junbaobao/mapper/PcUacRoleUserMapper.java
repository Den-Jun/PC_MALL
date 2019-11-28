package com.junbaobao.mapper;

import com.junbaobao.model.PcUacRoleUser;
import org.apache.ibatis.annotations.Param;

public interface PcUacRoleUserMapper {
    int deleteByPrimaryKey(@Param("roleId") Long roleId, @Param("userId") Long userId);

    int insert(PcUacRoleUser record);

    int insertSelective(PcUacRoleUser record);
}