package com.junbaobao.mapper;

import com.junbaobao.model.PcUacUser;

public interface PcUacUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcUacUser record);

    int insertSelective(PcUacUser record);

    PcUacUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacUser record);

    int updateByPrimaryKey(PcUacUser record);
}