package com.junbaobao.service;

import com.junbaobao.model.PcUacGroup;
public interface PcUacGroupService{


    int deleteByPrimaryKey(Long id);

    int insert(PcUacGroup record);

    int insertSelective(PcUacGroup record);

    PcUacGroup selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcUacGroup record);

    int updateByPrimaryKey(PcUacGroup record);

}
