package com.smart.home.common.service;

import com.smart.home.common.entity.Demo;
import com.smart.home.common.repository.DemoRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;


    public Demo create(Demo entity) {
        demoRepository.save(entity);
        return entity;
    }


    public void delete(String id) {
        demoRepository.deleteById(id);
    }

    public List<Demo> list() {
        return demoRepository.findAll();
    }
}
