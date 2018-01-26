package com.ssm.mapper;


import com.ssm.domain.Student;
import com.ssm.page.PageBean;

import java.util.List;

/**
 * student操作的对外接口声明
 * 具体实现见Student.xml
 */
public interface StudentMapper {
    /*查询所有学生 1方法名对应Student.xml中的id属性
    *            2方法返回参数对应Student.xml中的parameterType属性
    *            3方法返回值对应Student.xml中的resultType*/
    List<Student> selectAll();

//    分页查询 pageBean中包含分页对象
    List<Student> pageSelect(PageBean<Student> pageBean);

    /*获取学生表总条数*/
    Integer getTotalRecord(PageBean<Student> pageBean);



}
