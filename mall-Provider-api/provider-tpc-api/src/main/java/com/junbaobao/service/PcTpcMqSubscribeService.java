package com.junbaobao.service;

import com.junbaobao.model.PcTpcMqSubscribe;
public interface PcTpcMqSubscribeService{


    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqSubscribe record);

    int insertSelective(PcTpcMqSubscribe record);

    PcTpcMqSubscribe selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqSubscribe record);

    int updateByPrimaryKey(PcTpcMqSubscribe record);

}
