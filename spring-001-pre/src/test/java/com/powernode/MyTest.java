package com.powernode;

import com.powernode.config.SpringConfig;
import com.powernode.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * packageName com.powernode
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className MyTest
 * @date 2024/6/19
 * @description TODO
 */
public class MyTest {

    /**
     * 使用xml作为容器配置文件
     */
    @Test
    public void test01(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        Student myStudent = applicationContext.getBean("myStudent", Student.class);
        System.out.println("容器中的对象："+myStudent);
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(SpringConfig.class);
        Student myStudent = applicationContext.getBean("createStudent", Student.class);
        System.out.println("容器中的对象："+myStudent);
        System.out.println(myStudent.getAge());
    }
}