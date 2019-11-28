package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.junbaobao.model.PcOptAttachment;
import com.junbaobao.mapper.PcOptAttachmentMapper;
import com.junbaobao.service.PcOptAttachmentService;
@Service
public class PcOptAttachmentServiceImpl implements PcOptAttachmentService{

    @Resource
    private PcOptAttachmentMapper pcOptAttachmentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcOptAttachmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcOptAttachment record) {
        return pcOptAttachmentMapper.insert(record);
    }

    @Override
    public int insertSelective(PcOptAttachment record) {
        return pcOptAttachmentMapper.insertSelective(record);
    }

    @Override
    public PcOptAttachment selectByPrimaryKey(Long id) {
        return pcOptAttachmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcOptAttachment record) {
        return pcOptAttachmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcOptAttachment record) {
        return pcOptAttachmentMapper.updateByPrimaryKey(record);
    }

}
