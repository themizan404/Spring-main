/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.dao;

import com.mizan.spring.model.Doctor;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mohdm
 */
@Repository
@Transactional
public class DoctorDao {

    @Autowired
    SessionFactory sessionFactory;

    public Doctor save(Doctor doctor) {
        sessionFactory.getCurrentSession().save(doctor);
        sessionFactory.getCurrentSession().flush();
        return doctor;
    }

    public List<Doctor> getAll() {
        List<Doctor> docList = sessionFactory.getCurrentSession().createCriteria(Doctor.class).list();
//        sessionFactory.getCurrentSession().flush();
        return docList;
    }
}
