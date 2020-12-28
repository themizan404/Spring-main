/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sany;

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
 * @author fmrasel
 */
@Controller
public class StudentController {
    @Autowired
    StudentService service;
    
    @RequestMapping("")
    public String home(){
        return "index";
    }
    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public ModelAndView create(){
        Map<String, Object> map= new HashMap<String,Object>();
        List<Student> students= service.getAll();
        map.put("students", students);
        return new ModelAndView("/create", "map",map);
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(ModelMap map, @PathVariable("id") int id) {
        Student st = service.getById(id);
        map.addAttribute("st", st);
        return "create";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(HttpServletRequest request) {
        Student s= service.update(request);
        return "redirect:/create";
    }
    
//    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
//    public ModelAndView edit(int id){
//        Map<String, Object> map= new HashMap<String,Object>();
//        Student student= service.getById(id);
//        map.put("student", student);
//        return new ModelAndView("redirect:/create", "map",map);
//    }
//    @RequestMapping(value = "/view",method = RequestMethod.GET)
//    public ModelAndView view(){
//        Map<String, Object> map= new HashMap<String,Object>();
//        List<Student> students= service.getAll();
//        map.put("students", students);
//        return new ModelAndView("/view", "map",map);
//    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) { //Using @PathVariable by URL
        service.delete(id);
        return "redirect:/create";  // Redirect to a Handler Mapping after an action
    }
    
     @RequestMapping(value = "/save" ,method = RequestMethod.POST)
    public String save(HttpServletRequest request){
        service.save(request);
         return "redirect:/create";
    }
}
