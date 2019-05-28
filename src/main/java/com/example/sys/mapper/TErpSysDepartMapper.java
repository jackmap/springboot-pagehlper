package com.example.sys.mapper;

import com.example.sys.entity.TErpSysDepart;

public interface TErpSysDepartMapper {
    int deleteByPrimaryKey(Long departId);

    int insert(TErpSysDepart record);

    int insertSelective(TErpSysDepart record);

    TErpSysDepart selectByPrimaryKey(Long departId);

    int updateByPrimaryKeySelective(TErpSysDepart record);

    int updateByPrimaryKey(TErpSysDepart record);
}