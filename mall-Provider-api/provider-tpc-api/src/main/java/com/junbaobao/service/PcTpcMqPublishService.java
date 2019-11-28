package com.junbaobao.service;

import com.junbaobao.model.PcTpcMqPublish;
public interface PcTpcMqPublishService{


    int deleteByPrimaryKey(Long producerId,Long topicId);

    int insert(PcTpcMqPublish record);

    int insertSelective(PcTpcMqPublish record);

}
