/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.controller;

import com.mizan.spring.model.Doctor;
import com.mizan.spring.service.DoctorService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author mohdm
 */
@Controller
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String save() {
        return "create";
    }

    @RequestMapping(value = "store", method = RequestMethod.POST)
    public String store(HttpServletRequest request) {
        doctorService.save(request);
        return "create";
    }

    @RequestMapping(value = "edit")
    public String edit() {
        return "edit";
    }

    @RequestMapping(value = "edit", method = RequestMethod.GET)
    public ModelAndView view() {
        Map<String, Object> map = new HashMap<>();
        List<Doctor> docList = doctorService.getAll();
        map.put("docList", docList);

        return new ModelAndView("/create", "keymap", map);
    }

}
