package com.hhf.springcloud.controller;

import com.hhf.springcloud.entities.Dept;
import com.hhf.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class DeptController {

    @Value(value = "${appname}")
    public  String sever;

    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

    @RequestMapping(value = "/dept/getgs", method = RequestMethod.GET)
    public String getss(HttpServletRequest request){

        request.getSession().setAttribute("name","yingjie");
        return sever;
    }
}