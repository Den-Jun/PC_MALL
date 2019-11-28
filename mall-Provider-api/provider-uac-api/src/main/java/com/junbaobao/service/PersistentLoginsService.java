package com.junbaobao.service;

import com.junbaobao.model.PersistentLogins;
public interface PersistentLoginsService{


    int deleteByPrimaryKey(String series);

    int insert(PersistentLogins record);

    int insertSelective(PersistentLogins record);

    PersistentLogins selectByPrimaryKey(String series);

    int updateByPrimaryKeySelective(PersistentLogins record);

    int updateByPrimaryKey(PersistentLogins record);

}
