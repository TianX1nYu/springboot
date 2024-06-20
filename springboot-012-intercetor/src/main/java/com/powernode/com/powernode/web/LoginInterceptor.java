package com.powernode.com.powernode.web;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * packageName com.powernode.com.powernode.web
 *自定义拦截器
 * @author 田鑫宇
 * @version JDK 17
 * @className LoginInterceptor
 * @date 2024/6/20
 * @description TODO
 */
public class LoginInterceptor implements HandlerInterceptor {
    /*
    request:
    response:
    handler: 被拦截的控制器对象
    return :boolean true:请求能被Controller处理
                    false:请求被截断
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        System.out.println("执行了LoginInterceptor的preHandle");
        return HandlerInterceptor.super.preHandle(request, response, handler);
        //return false;
        //return true;
    }
}