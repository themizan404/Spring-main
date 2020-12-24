/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.web.service;

import com.spring.web.dao.ProductDAO;
import com.spring.web.model.Product;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Faculty Pc
 */
@Service
public class ProductService {
    
    
    @Autowired
    ProductDAO productDAO;
    
     public Product addProduct(HttpServletRequest request){
        String productCode = request.getParameter("productCode");
        String productName = request.getParameter("productName");
        
        Product p = new Product();
        p.setProductCode(productCode);
        p.setProductName(productName);
        
        productDAO.addProduct(p);
        
        return p;
    }
}
