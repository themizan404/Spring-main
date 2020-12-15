/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Faculty Pc
 */

@Controller
@RequestMapping(value = "product")
public class IndexController {
    
    @RequestMapping(value = "/create")
    public String hello(){
        return "product/create";
    }
    
    @RequestMapping(value = "/edit")
    public String hello1(){
        return "product/edit";
    }
    @RequestMapping(value = "/view")
    public String hello2(){
        return "product/view";
    }
    
    
     @RequestMapping(value = "/view/{test}")
    public String hello3(ModelMap map, @PathVariable("test") String s){
        map.addAttribute("userValue", s);
        return "product/view";
    }
    
    
    
    
    
}
