package com.junbaobao.service;

import com.junbaobao.model.PcUacUserToken;
public interface PcUacUserTokenService{


    int deleteByPrimaryKey(Long id);

    int insert(PcUacUserToken record);

    int insertSelective(PcUacUserToken record);

    PcUacUserToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacUserToken record);

    int updateByPrimaryKey(PcUacUserToken record);

}
