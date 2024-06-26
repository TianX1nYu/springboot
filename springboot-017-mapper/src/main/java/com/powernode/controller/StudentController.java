package com.powernode.controller;

import com.powernode.model.Student;
import com.powernode.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName com.powernode.controller
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className StudentController
 * @date 2024/6/25
 * @description TODO
 */
@Controller
public class StudentController {
    @Resource
    private StudentService studentService;
    @RequestMapping("student/query")
    @ResponseBody
    public String queryStudent(Integer id){
        Student student= studentService.queryStudent(id);
        return student.toString();
    }
}