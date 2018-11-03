package com.hhf.springcloud.service;

import com.hhf.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(value = "MICROSERVICECLOUD-DEPT" ,fallbackFactory=DeptClientServiceFallbackFactory.class) //向哪个微服务进行面向接口feign的编码
public interface DeptClientService {

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") long id);


    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();


    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(Dept dept);


}