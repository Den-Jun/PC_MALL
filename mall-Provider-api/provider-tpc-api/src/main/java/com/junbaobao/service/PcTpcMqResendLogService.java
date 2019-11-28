package com.junbaobao.service;

import com.junbaobao.model.PcTpcMqResendLog;
public interface PcTpcMqResendLogService{


    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqResendLog record);

    int insertSelective(PcTpcMqResendLog record);

    PcTpcMqResendLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqResendLog record);

    int updateByPrimaryKey(PcTpcMqResendLog record);

}
