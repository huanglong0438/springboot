package com.dc.multapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * AppDispatcher
 *
 * @title AppDispatcher
 * @Description
 * @Author donglongcheng01
 * @Date 2019-07-29
 **/
@SpringBootApplication
public class AppDispatcher {

    public static void main(String[] args) {
        System.out.println("AppDispatcher start ...");
        SpringApplication.run(AppDispatcher.class, args);
    }

}
