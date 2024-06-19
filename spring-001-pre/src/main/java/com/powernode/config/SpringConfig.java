package com.powernode.config;

import com.powernode.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * packageName com.powernode.config
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className SpringConfig
 * @date 2024/6/19
 * @description TODO
 */
    /**
    * @Configuration：表示当前类是 xml 配置文件的作用
    * 在这个类中有很多方法， 方法的返回值是对象。
    * 在这个方法的上面加入@Bean， 表示方法返回值的对象放入到容器中。
    * @Bean == <bean></bean>
    */
@Configuration
@ComponentScan("com.powernode.vo")
public class SpringConfig {
        /**
         * 定义方法， 方法的返回值是对象。
         * @Bean：表示把对象注入到容器中。
         * 位置： 方法的上面
         * @Bean 没有使用属性，默认对象名称是方法名
         */
        @Bean
        public Student createStudent(){
            Student student=new Student();
            student.setName("张三");
            student.setAge(18);
            student.setSex("男");
            return student;
        }
}