package com.xuan.person.mapper;

import com.xuan.person.pojo.Sex;

public interface SexMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sex record);

    int insertSelective(Sex record);

    Sex selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sex record);

    int updateByPrimaryKey(Sex record);
}