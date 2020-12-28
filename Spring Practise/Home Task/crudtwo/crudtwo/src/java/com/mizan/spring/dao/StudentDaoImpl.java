/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.dao;

import com.mizan.spring.model.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mohdm
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    @Transactional
    public void addStudent(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }
    
    @Override
    @Transactional
    public void updateStudent(Student student) {
        sessionFactory.getCurrentSession().update(student);
    }
    
    @Override
    @Transactional
    public List<Student> listStudent() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }
    
    @Override
    @Transactional
    public Student getStudentByID(Integer studentId) {
        Session session = sessionFactory.getCurrentSession();
        List<Student> list = session.createQuery("From Student s where s.id=:id").setParameter("studentId", studentId).list();
        return list.size() > 0 ? (Student) list.get(0) : null;
    }
    
    @Override
    @Transactional
    public void removeStudentByID(Integer studentId) {
        Student student = (Student) sessionFactory.getCurrentSession().load(Student.class, studentId);
        if (student != null) {
            sessionFactory.getCurrentSession().delete(student);
        }
    }
    
}
