/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.service;

import com.mizan.spring.model.Student;
import java.util.List;

/**
 *
 * @author mohdm
 */
public interface StudentService {

    public void addStudent(Student student);

    public void updateStudent(Student student);

    public List<Student> listStudent();

    public Student getStudentByID(Integer studentId);

    public void removeStudentByID(Integer studentId);

}
