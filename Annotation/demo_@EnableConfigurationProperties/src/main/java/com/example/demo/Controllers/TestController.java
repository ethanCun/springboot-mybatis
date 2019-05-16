package com.example.demo.Controllers;

import com.example.demo.Config.Config;
import com.example.demo.entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Config config;

    @GetMapping(value = "/config")
    public Object config(){

        return config.getAnimal().toString() + config.getOffset() + config.getAge() + config.getName();
    }
}