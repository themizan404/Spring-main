/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.controller;

import com.mizan.spring.model.Student;
import com.mizan.spring.service.StudentService;
import com.mizan.spring.service.StudentServiceImpl;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author mohdm
 */
@Controller
public class StudentController {

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping("/")
    public String listProduct(Map<String, Object> map) {
        map.put("student", new Student());
        map.put("studentList", studentService.listStudent());
        return "index";
    }

    @RequestMapping(value = "/student/add", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student, BindingResult result) {
        if (student.getId() == null) {
            studentService.addStudent(student);
        } else {
            studentService.updateStudent(student);
        }
        return "redirect:/";
    }

    @RequestMapping("/delete/{sid}")
    public String deleteStudent(@PathVariable("sid") Integer sid) {
        studentService.removeStudentByID(sid);

        return "redirect:/";
    }

    @RequestMapping("/edit/{sid}")
    public String editStudent(@PathVariable("sid") Integer sid, Map<String, Object> map) {
        map.put("id", studentService.getStudentByID(sid));
        map.put("studentList", studentService.listStudent());
        return "index";
    }
}
