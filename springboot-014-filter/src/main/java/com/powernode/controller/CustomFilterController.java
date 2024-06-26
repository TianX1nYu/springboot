package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName com.powernode.controller
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className CustomFilterController
 * @date 2024/6/20
 * @description TODO
 */
@Controller
public class CustomFilterController {
    @RequestMapping("/user/account")
    @ResponseBody
    public String userAccount(){
        return "/user/account";
    }
    @RequestMapping("/query")
    @ResponseBody
    public String queryAccount(){
        return "/query";
    }
}