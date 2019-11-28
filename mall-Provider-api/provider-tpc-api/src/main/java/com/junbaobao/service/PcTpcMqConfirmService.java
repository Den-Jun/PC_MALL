package com.junbaobao.service;

import com.junbaobao.model.PcTpcMqConfirm;
public interface PcTpcMqConfirmService{


    int deleteByPrimaryKey(Long id);

    int insert(PcTpcMqConfirm record);

    int insertSelective(PcTpcMqConfirm record);

    PcTpcMqConfirm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcTpcMqConfirm record);

    int updateByPrimaryKey(PcTpcMqConfirm record);

}
