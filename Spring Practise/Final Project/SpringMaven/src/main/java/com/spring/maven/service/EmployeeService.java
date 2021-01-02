/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.service;

import com.spring.maven.dao.impl.IEmployeeDAO;
import com.spring.maven.model.Employee;
import com.spring.maven.service.impl.IEmployeeService;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faculty Pc
 */
@Service(value = "employeeService")
public class EmployeeService implements IEmployeeService{

    @Autowired
    IEmployeeDAO employeeDAO;
    
    @Override
    public Employee save(HttpServletRequest request) {
       Map<String, String[]> map = request.getParameterMap();
       Employee e = new Employee();
       e.setName(map.get("name")[0]);
       e.setSalary(Double.parseDouble(map.get("salary")[0]));
       e.setNid(Integer.parseInt(map.get("nid")[0]));
       e.setArea(map.get("area")[0]);
       e.setCity(map.get("city")[0]);
       return employeeDAO.save(e);
    }

    @Override
    public Employee update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }

    @Override
    public Employee getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
