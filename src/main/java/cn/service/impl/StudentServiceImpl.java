package cn.service.impl;

import cn.mapper.StudentMapper;
import cn.model.Student;
import cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
