package com.hhf.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hhf.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
   @Override
   public DeptClientService create(Throwable throwable)
   {
       return new DeptClientService() {
           @Override
           public Dept get(long id)
           {
               Dept dept = new Dept();
               dept.setDb_source("no this database in MySQL");
               dept.setDeptno(id);
               dept.setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
               return dept;
           }

           @Override
           public List<Dept> list()
           {
               return null;
           }

           @Override
           public boolean add(Dept dept)
           {
               return false;
           }
       };
   }
}