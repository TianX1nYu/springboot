package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName com.powernode.controller
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className HelloSpringboot
 * @date 2024/6/19
 * @description TODO
 */
@Controller
public class HelloSpringboot {
    @RequestMapping("/hello")
    @ResponseBody//用于将Java对象转换为JSON或XML等格式的响应体，并直接写入HTTP响应
    public String helloSpringBoot(){
        return "欢迎使用SpringBoot框架";
    }
}