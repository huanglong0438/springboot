package com.dc.springboot;

import com.dc.configs.JdbcProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * App
 *
 * @title App
 * @Description
 * @Author donglongcheng01
 * @Date 2019-07-13
 **/
@SpringBootApplication
@ComponentScan({"com.dc.configs", "com.dc.springboot"})
@EnableConfigurationProperties({JdbcProperties.class})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
