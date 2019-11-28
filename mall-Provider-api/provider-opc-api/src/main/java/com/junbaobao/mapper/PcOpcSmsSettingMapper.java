package com.junbaobao.mapper;

import com.junbaobao.model.PcOpcSmsSetting;

public interface PcOpcSmsSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcOpcSmsSetting record);

    int insertSelective(PcOpcSmsSetting record);

    PcOpcSmsSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOpcSmsSetting record);

    int updateByPrimaryKey(PcOpcSmsSetting record);
}