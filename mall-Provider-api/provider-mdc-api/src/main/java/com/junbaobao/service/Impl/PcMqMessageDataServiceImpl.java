package com.junbaobao.service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.junbaobao.model.PcMqMessageData;
import com.junbaobao.mapper.PcMqMessageDataMapper;
import com.junbaobao.service.PcMqMessageDataService;

@Service
public class PcMqMessageDataServiceImpl implements PcMqMessageDataService {

    @Resource
    private PcMqMessageDataMapper pcMqMessageDataMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return pcMqMessageDataMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PcMqMessageData record) {
        return pcMqMessageDataMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(PcMqMessageData record) {
        return pcMqMessageDataMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(PcMqMessageData record) {
        return pcMqMessageDataMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(PcMqMessageData record) {
        return pcMqMessageDataMapper.insertSelective(record);
    }

    @Override
    public PcMqMessageData selectByPrimaryKey(Long id) {
        return pcMqMessageDataMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PcMqMessageData record) {
        return pcMqMessageDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PcMqMessageData record) {
        return pcMqMessageDataMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<PcMqMessageData> list) {
        return pcMqMessageDataMapper.updateBatch(list);
    }

}


