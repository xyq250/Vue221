package com.aaa.controller;

import com.aaa.dao.TeacherDao;
import com.aaa.eneity.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("user")
public class TeacherController {
    @Resource
    TeacherDao teacherDao;

    @RequestMapping("qeuryAll")
    @ResponseBody
    public List<Teacher> show(){
        return teacherDao.selectAll();
    }
    @RequestMapping("add")
    public void add(@RequestBody Teacher teacher){
        teacherDao.insert(teacher);
    }

    @RequestMapping("gai")
    public void upd(@RequestBody Teacher tea){
      teacherDao.updateByPrimaryKey(tea);
    }

    @RequestMapping("shan")
    public void shan(@RequestBody String tid){
        teacherDao.deleteByPrimaryKey(tid);
    }
}
