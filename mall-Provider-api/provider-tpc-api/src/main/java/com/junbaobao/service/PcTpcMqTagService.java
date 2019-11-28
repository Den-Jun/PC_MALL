package com.junbaobao.service;

import com.junbaobao.model.PcTpcMqTag;
public interface PcTpcMqTagService{


    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqTag record);

    int insertSelective(PcTpcMqTag record);

    PcTpcMqTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqTag record);

    int updateByPrimaryKey(PcTpcMqTag record);

}
