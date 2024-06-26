package com.powernode.dao;

import com.powernode.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * packageName com.powernode.com.powernode.dao
 *
 * @author 田鑫宇
 * @version JDK 17
 * @className StudentDao
 * @date 2024/6/25
 * @description TODO
 */
@Mapper//告诉MyBatis这是dao接口，创建此接口的代理对象
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);//@Param 作用其实就是将 id 重命名为 stuId
}