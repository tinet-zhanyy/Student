package cn.controller;

import cn.model.Student;
import cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("findAllStudent")
    public ModelAndView findAll(){
        List<Student> list = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.jsp");
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
