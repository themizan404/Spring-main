/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.service;

import com.mizan.spring.dao.StudentDao;
import com.mizan.spring.dao.StudentDaoImpl;
import com.mizan.spring.model.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohdm
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDaoImpl studentDao;

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
studentDao.updateStudent(student);
    }

    @Override
    public List<Student> listStudent() {
        return studentDao.listStudent();
    }

    @Override
    public Student getStudentByID(Integer studentId) {
        return studentDao.getStudentByID(studentId);
    }

    @Override
    public void removeStudentByID(Integer studentId) {
studentDao.removeStudentByID(studentId);
    }

}
