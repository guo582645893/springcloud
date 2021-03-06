package com.hhf.springcloud.dao;

import com.hhf.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//整合mybatis
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}