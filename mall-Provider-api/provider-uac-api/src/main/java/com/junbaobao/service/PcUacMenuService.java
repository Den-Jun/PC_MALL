package com.junbaobao.service;

import com.junbaobao.model.PcUacMenu;
public interface PcUacMenuService{


    int deleteByPrimaryKey(Long id);

    int insert(PcUacMenu record);

    int insertSelective(PcUacMenu record);

    PcUacMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacMenu record);

    int updateByPrimaryKey(PcUacMenu record);

}
