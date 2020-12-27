/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.controller;

import com.mizan.model.Employee;
import com.mizan.service.EmpService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mohdm
 */
@Controller
public class EmpController {

    @Autowired
    EmpService empService;

    @RequestMapping("/")
    public String display() {
        return "index";
    }

    @RequestMapping("create")
    public String displayFront() {
        return "create";
    }

//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String save(HttpServletRequest request) {
//        empService.save(request);
//        return "redirect:/create";
//    }
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String save(HttpServletRequest request) {
//        empService.save(request);
//        return "redirect:/create";
//
//    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(HttpServletRequest request) {
        empService.save(request);
        return "redirect:/create";
    }

//    @RequestMapping(value = "create", method = RequestMethod.GET)
//    public ModelAndView displayData() {
//        Map<String, Object> map = new HashMap<>();
//        List<Employee> employee = empService.getAll();
//        map.put("employee", employee);
//        return new ModelAndView("/create", "map", map);
//    }
//    @RequestMapping(value = "create", method = RequestMethod.GET)
//    public ModelAndView displayData(ModelMap map) {
//        List<Employee> employees = empService.getAll();
//
//        map.put("employee", employees);
//        return new ModelAndView("/create", "map", map);
//
//    }
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public ModelAndView displayData(ModelMap map) {
        List<Employee> employees = empService.getAll();
        map.put("employee", employees);
        return new ModelAndView("create", "map", map);

    }

//    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
//    public String delete(@PathVariable("id") int id) {
//        empService.delete(id);
//        return "redirect:/create";
//    }
//    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
//    public String delete(@PathVariable("id") int id) {
//        empService.delete(id);
//        return "redirect:/create";
//    }
//    
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        empService.delete(id);
        return "redirect:/create";
    }

//    @RequestMapping(value = "edit/{id}")
//    public String edit(ModelMap map, @PathVariable("id") int id) {
//        Employee pt = empService.getById(id);
//        map.put("pt", pt);
//        return "/create";
//    }
    @RequestMapping(value = "edit/{id}")
    public String edit(ModelMap map, @PathVariable("id") int id) {
        Employee pt = empService.getById(id);
        map.put("pt", pt);
        return "/create";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(HttpServletRequest request) {
        empService.update(request);
        return "redirect:/create";
    }
}
