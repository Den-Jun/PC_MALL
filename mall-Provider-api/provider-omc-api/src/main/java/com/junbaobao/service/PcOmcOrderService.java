package com.junbaobao.service;

import com.junbaobao.model.PcOmcOrder;
public interface PcOmcOrderService{


    int deleteByPrimaryKey(Long id);

    int insert(PcOmcOrder record);

    int insertSelective(PcOmcOrder record);

    PcOmcOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOmcOrder record);

    int updateByPrimaryKey(PcOmcOrder record);

}
