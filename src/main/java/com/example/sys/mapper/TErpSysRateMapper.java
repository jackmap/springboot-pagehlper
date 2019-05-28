package com.example.sys.mapper;

import com.example.sys.entity.TErpSysRate;

public interface TErpSysRateMapper {
    int deleteByPrimaryKey(Long rateId);

    int insert(TErpSysRate record);

    int insertSelective(TErpSysRate record);

    TErpSysRate selectByPrimaryKey(Long rateId);

    int updateByPrimaryKeySelective(TErpSysRate record);

    int updateByPrimaryKey(TErpSysRate record);
}