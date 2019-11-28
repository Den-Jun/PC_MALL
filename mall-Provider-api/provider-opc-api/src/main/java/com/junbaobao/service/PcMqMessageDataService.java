package com.junbaobao.service;

import com.junbaobao.model.PcMqMessageData;
public interface PcMqMessageDataService{


    int deleteByPrimaryKey(Long id);

    int insert(PcMqMessageData record);

    int insertSelective(PcMqMessageData record);

    PcMqMessageData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMqMessageData record);

    int updateByPrimaryKey(PcMqMessageData record);

}
