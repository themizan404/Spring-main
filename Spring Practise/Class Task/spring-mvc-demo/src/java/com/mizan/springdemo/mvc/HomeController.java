/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mohdm
 */
@Controller
@RequestMapping(value = "view")
public class HomeController {

    @RequestMapping(value = "/menu")
    public String showPage() {
        return "main-menu";
    }

}
