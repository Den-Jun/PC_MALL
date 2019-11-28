package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.junbaobao.model.PcMdcAttachment;
import com.junbaobao.mapper.PcMdcAttachmentMapper;
import com.junbaobao.service.PcMdcAttachmentService;

@Service
public class PcMdcAttachmentServiceImpl implements PcMdcAttachmentService {

    @Resource
    private PcMdcAttachmentMapper pcMdcAttachmentMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return pcMdcAttachmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcMdcAttachment record) {
        return pcMdcAttachmentMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PcMdcAttachment record) {
        return pcMdcAttachmentMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PcMdcAttachment record) {
        return pcMdcAttachmentMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PcMdcAttachment record) {
        return pcMdcAttachmentMapper.insertSelective(record);
    }

    @Override
    public PcMdcAttachment selectByPrimaryKey(String id) {
        return pcMdcAttachmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcMdcAttachment record) {
        return pcMdcAttachmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcMdcAttachment record) {
        return pcMdcAttachmentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PcMdcAttachment> list) {
        return pcMdcAttachmentMapper.updateBatch(list);
    }

}


