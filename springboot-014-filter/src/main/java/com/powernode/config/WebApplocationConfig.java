package com.powernode.config;

import com.powernode.web.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName com.powernode.com.powernode.config
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className WebApplocationConfig
 * @date 2024/6/20
 * @description TODO
 */
@Configuration
public class WebApplocationConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new MyFilter());
        bean.addUrlPatterns("/user/*");
        return bean;
    }
}