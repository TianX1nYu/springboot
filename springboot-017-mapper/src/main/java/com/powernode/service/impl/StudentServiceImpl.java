package com.powernode.service.impl;

import com.powernode.dao.StudentDao;
import com.powernode.model.Student;
import com.powernode.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * packageName com.powernode.service.impl
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className StudentServiceImpl
 * @date 2024/6/25
 * @description TODO
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        Student student=studentDao.selectById(id);
        return student;
    }
}