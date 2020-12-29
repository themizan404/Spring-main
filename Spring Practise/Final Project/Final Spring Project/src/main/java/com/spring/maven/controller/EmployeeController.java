/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.maven.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.spring.maven.controller.impl.IEmployeeController;
import com.spring.maven.dao.impl.IEmployeeDAO;
import com.spring.maven.model.Employee;
import com.spring.maven.service.impl.IEmployeeService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Faculty Pc
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController implements IEmployeeController {

    @Autowired
    IEmployeeService employeeService;

    @Autowired
    IEmployeeDAO employeeDAO;

    @Override
    @RequestMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("employee/create");
    }

    @Override
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(HttpServletRequest request) {
        Employee e = employeeService.save(request);
        Map<String, Object> map = new HashMap<>();
        if (e != null) {
            map.put("status", "Data Saved");
            return new ModelAndView("/employee/create", "map", map);
        } else {
            map.put("status", "Data NOT Saved");
            return new ModelAndView("/employee/create", "map", map);
        }

    }

    @Override
    @RequestMapping("/edit/{id}")
    public ModelAndView edit(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping("/update")
    public ModelAndView update(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping("/delete/{id}")
    public ModelAndView delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAll() {
        System.out.println("hitted");
        return employeeService.getAll();
    }

    @Override
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllEmployees() {
        GsonBuilder gson = new GsonBuilder();
        Gson g = gson.create();
        List<Employee> e = employeeService.getAll();
        for (Employee e1 : e) {
            System.out.println(e1.getName());
        }
        return g.toJson(e);
    }

    @RequestMapping(value = "/save1", method = RequestMethod.POST)
    public void save1(
            @RequestParam("name") String name,
            @RequestParam("salary") String salary,
            @RequestParam("nid") String nid,
            @RequestParam("area") String area,
            @RequestParam("city") String city
    ) {
        Employee e = new Employee();
        e.setName(name);
        e.setSalary(Double.parseDouble(salary));
        e.setNid(Integer.parseInt(nid));
        e.setArea(area);
        e.setCity(city);
        employeeDAO.save(e);
    }

}
