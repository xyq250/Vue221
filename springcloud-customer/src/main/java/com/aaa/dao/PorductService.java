package com.aaa.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-porduct")
public interface PorductService {

    @RequestMapping("/user/add")
    void add(Teacher teacher);

    @RequestMapping("/user/gai")
    void upd(Teacher teacher);

    @RequestMapping("/user/shan")
    void del(String tid);
}
