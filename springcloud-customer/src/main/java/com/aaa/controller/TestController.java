package com.aaa.controller;

import com.aaa.dao.PorductService;
import com.aaa.dao.Teacher;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
public class TestController {
    @Resource
    PorductService porductService;
    @RequestMapping("add")
    public  void  add(@RequestBody Teacher teacher){
        porductService.add(teacher);
    }

    @RequestMapping("upd")
    public  void  upd(@RequestBody Teacher teacher){
        porductService.upd(teacher);
    }

    @RequestMapping("del")
    public  void  del(String tid){
        porductService.del(tid);
    }
}
