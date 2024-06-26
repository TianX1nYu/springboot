package com.powernode.controller;

import com.powernode.model.Student;
import com.powernode.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName com.powernode.controller
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className StudentController
 * @date 2024/6/26
 * @description TODO
 */
@Controller
public class StudentController {
    @Resource
    private StudentService service;
    @Resource
    private Student student;
    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String name, Integer age){
        student.setName(name);
        student.setAge(age);
        int rows= service.addStudent(student);
        return "添加学生:"+rows;

    }
}