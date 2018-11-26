package cn.service;

import cn.model.Student;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有用户
     * */
    public List<Student> findAll();
}
