package com.junbaobao.service;

import com.junbaobao.model.PcTpcMqSubscribeTag;
public interface PcTpcMqSubscribeTagService{


    int deleteByPrimaryKey(Long subscribeId,Long tagId);

    int insert(PcTpcMqSubscribeTag record);

    int insertSelective(PcTpcMqSubscribeTag record);

}
