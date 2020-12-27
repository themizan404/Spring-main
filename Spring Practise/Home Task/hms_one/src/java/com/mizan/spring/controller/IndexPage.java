/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mohdm
 */
@Controller
public class IndexPage {

    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }

}
