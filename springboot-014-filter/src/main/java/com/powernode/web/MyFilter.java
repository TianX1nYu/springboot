package com.powernode.web;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * packageName com.powernode.com.powernode.web
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className MyFilter
 * @date 2024/6/20
 * @description TODO
 */
//自定义过滤器
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了MyFilter，doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}