/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.web.service;

import com.mizan.web.DAO.StudentDAO;
import com.mizan.web.model.Student;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohdm
 */
@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;

    public void save(HttpServletRequest request) {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String subject = request.getParameter("subject");

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSubject(subject);
        studentDAO.save(student);
    }
}
