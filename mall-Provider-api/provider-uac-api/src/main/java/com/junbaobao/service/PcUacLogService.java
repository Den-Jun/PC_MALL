package com.junbaobao.service;

import com.junbaobao.model.PcUacLog;
public interface PcUacLogService{


    int deleteByPrimaryKey(Long id);

    int insert(PcUacLog record);

    int insertSelective(PcUacLog record);

    PcUacLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacLog record);

    int updateByPrimaryKey(PcUacLog record);

}
