package com.xuan.person.service.impl;

import com.xuan.person.mapper.PersonMapper;
import com.xuan.person.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonMapper personMapper;
}
