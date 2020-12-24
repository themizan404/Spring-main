/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web.controller;

import com.spring.web.dao.ProductDAO;
import com.spring.web.model.Product;
import com.spring.web.service.ProductService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Faculty Pc
 */

@Controller
@RequestMapping(value = "product")
public class ProductController {
    
    @Autowired
    ProductService productService;
    @Autowired
    ProductDAO productDAO;
    
    @RequestMapping("/create")
    public String createProduct(){
        return "product/create";
    }
  
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addProduct(HttpServletRequest request){
        Product p = productService.addProduct(request);
        return "product/create";
    }
    
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewProducts(){
        productDAO.getAllProducts();
        return "product/create";
    }
    
    
    
    
}
