package com.junbaobao.mapper;

import com.junbaobao.model.PcUacUserToken;

public interface PcUacUserTokenMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcUacUserToken record);

    int insertSelective(PcUacUserToken record);

    PcUacUserToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacUserToken record);

    int updateByPrimaryKey(PcUacUserToken record);
}