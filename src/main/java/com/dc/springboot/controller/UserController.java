package com.dc.springboot.controller;

import com.dc.configs.HttpService;
import com.dc.configs.PropertiesManager;
import com.dc.springboot.bean.DcFile;
import com.dc.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private User user;

    @Autowired
    private DcFile dcFile;

    private PropertiesManager propertiesManager;

    /**
     * 这里用了beanHttpServer可以直接注入PropertiesManager中配置的HttpService
     */
    @Autowired
    private HttpService beanHttpServer;

    public UserController(PropertiesManager propertiesManager) {
        this.propertiesManager = propertiesManager;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "The World!!!";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String user() {
        return user.toString();
    }

    @RequestMapping("/file")
    @ResponseBody
    public String file() {
        return dcFile.toString();
    }

    @RequestMapping("/http")
    @ResponseBody
    public String httpService() {
        return beanHttpServer.getServiceUrl();
    }

}
