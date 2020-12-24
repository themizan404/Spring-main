package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
    
    @RequestMapping(value = "/")
    public String index(){
        System.out.println("Hello from Spring Web");
        return "index";
    }
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        System.out.println("hit by hello");
        return "hello";
    }
    
    @RequestMapping(value = "/hello/{name}/{address}/{round}", method = RequestMethod.GET)
    public String hello1(
            ModelMap map,
            @PathVariable("name") String name, 
            @PathVariable("address") String address,
            @PathVariable("round") String round
    ){
        System.err.println(name);
        System.err.println(address);
        System.err.println(round);
        map.addAttribute("name", name);
        map.addAttribute("address", address);
        map.addAttribute("round", round);
        return "hello";
    }
    
    
    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String newpage(ModelMap model){
        return "new";
    }
    
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String newpage1(
            ModelMap model, 
            @RequestParam("name") String name,
            @RequestParam("address") String address
            )
    {
        model.addAttribute("name", name);
        model.addAttribute("address", address);
        return "new";
    }
    

}
