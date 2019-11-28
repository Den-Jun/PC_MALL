package com.junbaobao.service;

import com.junbaobao.model.PcTpcMqTopic;
public interface PcTpcMqTopicService{


    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqTopic record);

    int insertSelective(PcTpcMqTopic record);

    PcTpcMqTopic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqTopic record);

    int updateByPrimaryKey(PcTpcMqTopic record);

}
