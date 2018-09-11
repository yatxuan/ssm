package com.xuan.person.controller;

import com.xuan.person.entity.JsonResult;
import com.xuan.person.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping("/getIndex")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/getPersonList")
    @ResponseBody
    public JsonResult getPersonList() {
        return personService.getPersonList();
    }
}
