package com.xuan.person.mapper;

import com.xuan.person.pojo.Person;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

//    @Select(" select * from person")
    List<Person> getPersonList();
}