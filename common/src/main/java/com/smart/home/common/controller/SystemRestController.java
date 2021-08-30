package com.smart.home.common.controller;

import com.smart.home.common.entity.Demo;
import com.smart.home.common.service.DemoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
public class SystemRestController {

    @Resource
    private DemoService demoService;

    @GetMapping(value = "/hello")
    public String hello(){
        return UUID.randomUUID().toString();
    }

    @PostMapping(value = "/demo")
    public String create() {
        Demo entity = Demo.builder().message("HHHHHHHH").build();
        demoService.create(entity);
        return entity.getId();
    }

    @GetMapping(value = "/list")
    @ResponseBody
    public List<Demo> list() {
        return demoService.list();
    }

}
