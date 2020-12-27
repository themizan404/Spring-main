/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.dao;

import com.mizan.model.Employee;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mohdm
 */
@Controller
@Transactional
public class EmpDao {

    @Autowired
    SessionFactory sessionFactory;

//    public void save(Employee employee) {
//        sessionFactory.getCurrentSession().save(employee);
//        sessionFactory.getCurrentSession().flush();
//
//    }
//    public void save(Employee employee) {
//        sessionFactory.getCurrentSession().save(employee);
//        sessionFactory.getCurrentSession().flush();
//
//    }
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
        sessionFactory.getCurrentSession().flush();
    }

//    public List<Employee> getAll() {
//        List<Employee> employees = sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
//        sessionFactory.getCurrentSession().flush();
//        return employees;
//    }
//    public List<Employee> getAll() {
//        List<Employee> employees = sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
//        sessionFactory.getCurrentSession().flush();
//        return employees;
//
//    }
    public List<Employee> getAll() {
        List<Employee> employees = sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
        sessionFactory.getCurrentSession().flush();
        return employees;
    }

//    public Employee delete(int id) {
//        Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
//        sessionFactory.getCurrentSession().delete(employee);
//        return employee;
//    }
    public Employee delete(int id) {
        Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class, id);
        sessionFactory.getCurrentSession().delete(employee);
        return employee;
    }

//    public Employee getById(int id) {
//        Employee pt = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
//        sessionFactory.getCurrentSession().flush();
//        return pt;
//    }
    public Employee getById(int id) {
        Employee pt = (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
        sessionFactory.getCurrentSession().flush();
        return pt;
    }

    public void update(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
        sessionFactory.getCurrentSession().flush();
    }
}
