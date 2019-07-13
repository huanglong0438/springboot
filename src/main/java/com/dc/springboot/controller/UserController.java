package com.dc.springboot.controller;

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

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "DIO: The World!!!!";
    }

}
