package com.example.demo;

import com.example.demo.Config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

//只扫描不和app在同一个包下的其他包 则app所在的包和子包下面的类不会被扫描
@ComponentScan(basePackages = {"com.example.demo2"})
@SpringBootApplication
//@EnableConfigurationProperties用于使使用 @ConfigurationProperties 注解的类生效。
//在使用 @ConfigurationProperties 注解的类上加上@component可以达到同样的效果
//@EnableConfigurationProperties({Config.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
