package com.ssm.service;


import com.ssm.domain.BaseResult;
import com.ssm.domain.Student;

import java.util.List;

/**
 * Created by YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY on 18/1/26哈哈.
 */
public interface StudentService {

    List<Student> selectAll();

    /*分页查询
    * pageIndex 页码 0开始
    * pageSize 每页显示的条数
    *
    * @return 返回包含total和data的结果封装对象
    *
    * student包含条件查询的参数对象
    * */
    BaseResult<Student> pageSelect(int pageIndex,int pageSize,Student student);
}
