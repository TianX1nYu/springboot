package com.powernode.controller;

import com.powernode.mapper.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        System.out.println("执行了dosome方法");
        return "springboot应用,设置了端口";
    }

    @RequestMapping("/hello1")
    @ResponseBody
    public String showSomeInfo(@RequestBody String userName){
        System.out.println("showSomeInfo方法被传入："+userName);
        System.out.println(userName);
        return userName;
    }

    @RequestMapping("/hello2")
    @ResponseBody//返回给浏览器的信息
    public User showUserInfo(@RequestBody User user){//@RequestBody是浏览器post到服务器时需要的注解
        System.out.println("showSomeInfo方法被传入："+user);
        System.out.println(user.user1.name);
        System.out.println(user.user1.phoneNumber);
        System.out.println(user.user1.address);
        return user;
    }
}