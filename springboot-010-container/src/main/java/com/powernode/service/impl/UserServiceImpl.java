package com.powernode.service.impl;

import com.powernode.service.UserService;
import org.springframework.stereotype.Service;

/**
 * packageName com.powernode.service.impl
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className UserServiceImpl
 * @date 2024/6/19
 * @description TODO
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行了业务方法sayHello："+name);
    }
}