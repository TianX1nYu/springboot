package com.powernode.service.impl;

import com.powernode.dao.StudentMapper;
import com.powernode.model.Student;
import com.powernode.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName com.powernode.service.impl
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className StudentServiceImpl
 * @date 2024/6/26
 * @description TODO
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Transactional//启用事务。表示方法有事务的支持，
    //              默认:使用哭的隔离级别，REQUIRED  传播行为：超时时间  -1
    //              抛出运行时异常，回滚事务
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法addStudent");
        int row=studentMapper.insert(student);
        System.out.println("执行sql语句");

        //抛出一个运行时异常，目的是回滚事务
        //int m =10/0;
        return row;
    }
}