/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sany;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;
    
    public void save(HttpServletRequest request) {
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Student s = new Student();
        s.setName(name);
        System.out.println(name);
        s.setAddress(address);
        studentDAO.save(s);

    }
    
    public Student update(HttpServletRequest request) {
        int id =Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        System.out.println(id);
        s.setAddress(address);
        studentDAO.update(s);
        return s;
    }
    
    public Student delete(int id) {
        return studentDAO.delete(id);
    }
    
    public Student getById(int id) {
        return studentDAO.getById(id);
    }
    public List<Student> getAll() {
        List<Student> students=studentDAO.getAll();
        return students;
       
    }
}
