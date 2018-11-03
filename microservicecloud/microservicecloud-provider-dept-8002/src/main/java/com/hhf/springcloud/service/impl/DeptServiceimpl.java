package com.hhf.springcloud.service.impl;

import com.hhf.springcloud.dao.DeptDao;
import com.hhf.springcloud.entities.Dept;
import com.hhf.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service("deptService")
public class DeptServiceimpl implements DeptService {

    @Resource
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }

}