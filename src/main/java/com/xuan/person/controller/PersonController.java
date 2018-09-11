package com.xuan.person.controller;

import com.xuan.person.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonService personService;
}
