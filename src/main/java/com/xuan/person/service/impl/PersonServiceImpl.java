package com.xuan.person.service.impl;

import com.xuan.person.entity.JsonResult;
import com.xuan.person.entity.ResultCode;
import com.xuan.person.mapper.PersonMapper;
import com.xuan.person.pojo.Person;
import com.xuan.person.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonMapper personMapper;

    @Override
    public JsonResult getPersonList() {

        JsonResult jsonResult;
        List<Person> list = personMapper.getPersonList();

        if (list.size()>0)
            jsonResult=new JsonResult(ResultCode.SCUUESS,list);
        else
            jsonResult=new JsonResult(ResultCode.ERROR);

        return jsonResult;
    }
}
