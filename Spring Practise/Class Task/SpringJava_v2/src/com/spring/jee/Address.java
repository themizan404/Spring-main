/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jee;

import org.springframework.stereotype.Component;

/**
 *
 * @author Faculty Pc
 */
@Component
public class Address {
    private String area;
    private String city;
    private String state;

    public Address(String area, String city, String state) {
        this.area = area;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return area + " " + city + " " + state;
    }
    
    
    
}
