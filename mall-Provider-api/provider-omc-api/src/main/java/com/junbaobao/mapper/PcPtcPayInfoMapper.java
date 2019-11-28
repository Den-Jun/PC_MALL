package com.junbaobao.mapper;

import com.junbaobao.model.PcPtcPayInfo;

public interface PcPtcPayInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PcPtcPayInfo record);

    int insertSelective(PcPtcPayInfo record);

    PcPtcPayInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcPtcPayInfo record);

    int updateByPrimaryKey(PcPtcPayInfo record);
}