package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import ru.kpfu.itis.service.SomeService;

@Controller
public class IndexController {

    @Autowired
    SomeService service;

    @RequestMapping(value = {"/", "index"})
    public String getIndexPage() {
        service.someMethod();
        return "index";
    }

}
