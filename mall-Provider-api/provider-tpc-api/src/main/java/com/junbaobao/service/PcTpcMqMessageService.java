package com.junbaobao.service;

import com.junbaobao.model.PcTpcMqMessage;
public interface PcTpcMqMessageService{


    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqMessage record);

    int insertSelective(PcTpcMqMessage record);

    PcTpcMqMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqMessage record);

    int updateByPrimaryKey(PcTpcMqMessage record);

}
