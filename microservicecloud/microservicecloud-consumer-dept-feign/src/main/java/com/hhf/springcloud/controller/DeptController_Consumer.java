package com.hhf.springcloud.controller;

import com.hhf.springcloud.entities.Dept;
import com.hhf.springcloud.service.DeptClientService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class DeptController_Consumer {


    @Resource
    private DeptClientService deptClientService;


    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {

        return this.deptClientService.get(id);

    }


    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()  {

        return this.deptClientService.list();

    }


    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)  {

        return this.deptClientService.add(dept);

    }


}