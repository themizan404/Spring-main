/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.dao;

import com.mizan.model.Patient;
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
public class PatientDao {

    @Autowired
    SessionFactory sessionFactory;

    public void save(Patient patient) {
        sessionFactory.getCurrentSession().save(patient);
        sessionFactory.getCurrentSession().flush();
    }

    public List<Patient> getAll() {
        List<Patient> patients = sessionFactory.getCurrentSession().createCriteria(Patient.class).list();
        sessionFactory.getCurrentSession().flush();
        return patients;
    }

    public Patient delete(int id) {
        Patient patient = (Patient) sessionFactory.getCurrentSession().load(Patient.class, id);
        sessionFactory.getCurrentSession().delete(patient);
        sessionFactory.getCurrentSession().flush();
        return patient;
    }

    public Patient getById(int id) {
        Patient patient = (Patient) sessionFactory.getCurrentSession().get(Patient.class, id);
        sessionFactory.getCurrentSession().flush();
        return patient;
    }

    public void update(Patient patient) {
        sessionFactory.getCurrentSession().saveOrUpdate(patient);
        sessionFactory.getCurrentSession().flush();
    }
	
	
	
}
