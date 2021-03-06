package com.example.demo.Controllers;

import com.example.demo.Config.Config;
import com.example.demo.Service.AsyncTaskService;
import com.example.demo.comon.annotation.czyconfigure;
import com.example.demo.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;

//引入自定义的@czyconfigure方便测试
@czyconfigure
@RestController
public class TestController {

    @Resource
    private Config config;

    @Resource
    private AsyncTaskService asyncTaskService;

    @GetMapping(value = "/config")
    public Object config(){

        return config.getAnimal().toString() + config.getOffset() + config.getAge() + config.getName();
    }

    @GetMapping(value = "/enableAsyncTest")
    public void enableAsync(){

//        System.out.println("startTime = " + LocalDateTime.now());

        //sync:
        //startTime = 2019-05-16T00:37:00.988
        //endTime = 2019-05-16T00:37:11.626

        //async:
        //

//        for (int i=0; i<10; i++){
//
//            asyncTaskService.test1();
//            asyncTaskService.test2();
//        }

//        System.out.println("endTime = " + LocalDateTime.now());

    }

    @GetMapping(path = "/testAliasfor")
    public String testAliasfor(){

        czyconfigure configure = AnnotationUtils.findAnnotation(getClass(), czyconfigure.class);

        return configure.value() + " " + configure.getClass();
    }
}
