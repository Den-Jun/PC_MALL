package com.junbaobao.service;

import com.junbaobao.model.PcOpcSmsSetting;
public interface PcOpcSmsSettingService{


    int deleteByPrimaryKey(Long id);

    int insert(PcOpcSmsSetting record);

    int insertSelective(PcOpcSmsSetting record);

    PcOpcSmsSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOpcSmsSetting record);

    int updateByPrimaryKey(PcOpcSmsSetting record);

}
