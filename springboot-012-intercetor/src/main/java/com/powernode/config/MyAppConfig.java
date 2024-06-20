package com.powernode.config;

import com.powernode.com.powernode.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName com.powernode.config
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className MyAppConfig
 * @date 2024/6/20
 * @description TODO
 */
@Configuration
public class MyAppConfig implements WebMvcConfigurer {
    /**
     * WebMvcConfigurer中有很多和springmvc有关的功能，
     * 把xml文件融入到了WebMvcConfigurer中
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建拦截器对象
        HandlerInterceptor interceptor = new LoginInterceptor();
        //指定拦截的请求url地址,制定后，在请求映射页面之前执行逻辑判断，返回true则可以访问页面
        String path []={"/user/**"};
        //指定不拦截的地址
        String excluPath []={"/user/login"};
        registry.addInterceptor(interceptor)
                .addPathPatterns(path)
                .excludePathPatterns(excluPath);
        //WebMvcConfigurer.super.addInterceptors(registry);
    }

}