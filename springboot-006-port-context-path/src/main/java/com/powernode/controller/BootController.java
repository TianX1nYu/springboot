package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName com.powernode.controller
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className BootController
 * @date 2024/6/19
 * @description TODO
 */
@Controller
public class BootController {
    @RequestMapping("/hello")
    @ResponseBody
    public String doSome(){
        return "springboot应用,设置了端口";
    }
}