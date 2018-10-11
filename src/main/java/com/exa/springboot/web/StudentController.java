package com.exa.springboot.web;

import com.exa.springboot.exception.StudentExecption;
import com.exa.springboot.mapper.StudentMapper;
import com.exa.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/u")
    public String fintStudent(Model model)throws StudentExecption{
            Student student = (Student) studentMapper.findByID(3);
        List<Student> students = new ArrayList<>();
//            students = studentMapper.findByName("华");
            students.add(student);
            System.out.println("查询出来数据size："+students.size());
            model.addAttribute("students",students);
        return "core/studentList";
    }



}
