package com.junbaobao.service;

import com.junbaobao.model.PcOmcOrderDetail;
public interface PcOmcOrderDetailService{


    int deleteByPrimaryKey(Long id);

    int insert(PcOmcOrderDetail record);

    int insertSelective(PcOmcOrderDetail record);

    PcOmcOrderDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOmcOrderDetail record);

    int updateByPrimaryKey(PcOmcOrderDetail record);

}
