package com.powernode.com.powernode.vo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * packageName com.powernode.com.powernode.vo
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className SchoolInfo
 * @date 2024/6/19
 * @description TODO
 */
@Component
@ConfigurationProperties(prefix = "school")////两种方式：二、@ConfigurationProperties+set方法
public class SchoolInfo {
    private String name;
    private String website;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SchoolInfo{" +
                "name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}