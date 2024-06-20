package com.powernode.com.powernode.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName com.powernode.com.powernode.controller
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className BootController
 * @date 2024/6/20
 * @description TODO
 */
@Controller
public class BootController {
    @RequestMapping("/user/account")
    @ResponseBody
    public String queryAccount(){
        System.out.println("account页面");
        return "/user/account";
    }
    @RequestMapping("/user/login")
    @ResponseBody
    public String loginIn(){
        System.out.println("login页面");
        return "/user/login";
    }
}