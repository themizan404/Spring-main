/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.service;

import com.mizan.dao.EmpDao;
import com.mizan.model.Employee;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mohdm
 */
@Service
public class EmpService {

    @Autowired
    EmpDao empDao;

//    public void save(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        double salary = Double.parseDouble(request.getParameter("salary"));
//        String post = request.getParameter("post");
//
//        Employee employee = new Employee();
//        employee.setName(name);
//        employee.setSalary(salary);
//        employee.setPost(post);
//        empDao.save(employee);
//    }
//    public void save(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        double salary = Double.parseDouble(request.getParameter("salary"));
//        String post = request.getParameter("post");
//
//        Employee employee = new Employee();
//        employee.setName(name);
//        employee.setSalary(salary);
//        employee.setPost(post);
//        empDao.save(employee);
//    }
    public void save(HttpServletRequest request) {
        String name = request.getParameter("name");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String post = request.getParameter("post");

        Employee employee = new Employee();
        employee.setName(name);
        employee.setSalary(salary);
        employee.setPost(post);

        empDao.save(employee);
    }

//    public List<Employee> getAll() {
//        List<Employee> employees = empDao.getAll();
//        return employees;
//    }
//    public List<Employee> getAll() {
//
//        List<Employee> employees = empDao.getAll();
//        return employees;
//    }
    public List<Employee> getAll() {
        List<Employee> employees = empDao.getAll();
        return employees;
    }

//    public Employee delete(int id) {
//        return empDao.delete(id);
//
//    }
    public Employee delete(int id) {
        return empDao.delete(id);

    }

//    public Employee getById(int id) {
//        Employee pt = empDao.getById(id);
//        return pt;
//    }
    public Employee getById(int id) {
        Employee pt = empDao.getById(id);
        return pt;
    }

    public void update(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double salary = Double.parseDouble(request.getParameter("salary"));
        String post = request.getParameter("post");

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setSalary(salary);
        employee.setPost(post);

        empDao.update(employee);
    }

}
