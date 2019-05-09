package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.dao")
public class DemoApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //这里配置静态资源文件的路径导包都是默认的直接导入就可以
    //配置spring启动的时候加载static下面的静态文件一起运行
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        //表示在磁盘static目录下的所有资源会被解析为以下的路径 classpath:/static/  http://localhost:8080/static/img/test.png
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");

        super.addResourceHandlers(registry);
    }
}