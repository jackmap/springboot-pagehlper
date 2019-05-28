package com.example.sys.mapper;

import com.example.sys.entity.TErpSysSet;

public interface TErpSysSetMapper {
    int deleteByPrimaryKey(Long setId);

    int insert(TErpSysSet record);

    int insertSelective(TErpSysSet record);

    TErpSysSet selectByPrimaryKey(Long setId);

    int updateByPrimaryKeySelective(TErpSysSet record);

    int updateByPrimaryKey(TErpSysSet record);
}