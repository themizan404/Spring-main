/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.controller;

import com.mizan.model.Patient;
import com.mizan.service.PatientService;
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
public class PatientController {

    @Autowired
    PatientService service;

    @RequestMapping("")
    public String display() {
        return "index";
    }

    @RequestMapping(value = "create")
    public String frontPage() {
        return "create";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(HttpServletRequest request) {
        service.save(request);
        return "redirect:/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView displayData() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Patient> patients = service.getAll();

        map.put("patients", patients);

        return new ModelAndView("/create", "map", map);

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/create";
    }

    @RequestMapping(value = "/edit/{id}")
    public String edit(ModelMap map, @PathVariable("id") int id) {

        Patient pt = service.getById(id);
        map.put("pt", pt);
        return "/create";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(HttpServletRequest request) {
        service.update(request);
        return "redirect:/create";
    }
}
