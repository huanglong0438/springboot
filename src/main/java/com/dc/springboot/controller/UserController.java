package com.dc.springboot.controller;

import com.dc.configs.PropertiesManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 *
 * @title UserController
 * @Description
 * @Author donglongcheng01
 * @Date 2019-07-13
 **/
@Controller
public class UserController {

    private PropertiesManager propertiesManager;

    public UserController(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "DIO: The World!!!!";
    }

    @RequestMapping("/http")
    @ResponseBody
    public String httpService() {
        return propertiesManager.httpService().getServiceUrl();
    }

}
