package com.junbaobao.service;

import java.util.List;
import com.junbaobao.model.PcMdcAddress;

public interface PcMdcAddressService {


    int deleteByPrimaryKey(Long id);

    int insert(PcMdcAddress record);

    int insertOrUpdate(PcMdcAddress record);

    int insertOrUpdateSelective(PcMdcAddress record);

    int insertSelective(PcMdcAddress record);

    PcMdcAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcMdcAddress record);

    int updateByPrimaryKey(PcMdcAddress record);

    int updateBatch(List<PcMdcAddress> list);

}


