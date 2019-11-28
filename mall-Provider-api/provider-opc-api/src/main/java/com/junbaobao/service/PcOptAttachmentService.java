package com.junbaobao.service;

import com.junbaobao.model.PcOptAttachment;
public interface PcOptAttachmentService{


    int deleteByPrimaryKey(Long id);

    int insert(PcOptAttachment record);

    int insertSelective(PcOptAttachment record);

    PcOptAttachment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PcOptAttachment record);

    int updateByPrimaryKey(PcOptAttachment record);

}
