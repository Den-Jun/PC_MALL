package com.junbaobao.service;

import com.junbaobao.model.PcOmcCart;
public interface PcOmcCartService{


    int deleteByPrimaryKey(Long id);

    int insert(PcOmcCart record);

    int insertSelective(PcOmcCart record);

    PcOmcCart selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOmcCart record);

    int updateByPrimaryKey(PcOmcCart record);

}
