package com.powernode.controller;

import com.powernode.com.powernode.vo.SchoolInfo;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * packageName com.powernode.controller
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className HelloController
 * @date 2024/6/19
 * @description TODO
 */
@Controller//两种方式：一、@Controller+@Value+.properties文件中填好数据
public class HelloController {
    @Value("${school.name}")
    private String name;
    @Value("${server.port}")
    private Integer port;
    @Value("${site}")
    private String site;
    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Resource
    private SchoolInfo info;
    @RequestMapping("/data")
    @ResponseBody
    public String queryData(){
        return name+",port="+port+",site="+site+",context-path="+contextPath;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryInfo(){
        return "schoolinfo="+ info.toString();
    }

}