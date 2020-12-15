/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jee;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 *
 * @author Faculty Pc
 */

@Component(value = "t")
public class Trainee {
    private String name;
    private int round;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Address getAddress() {
        return address;
    }

    //@Autowired
    //@Required
    public void setAddress(Address address) {
        this.address = address;
    }
    
    //@PostConstruct
    public void initTrainee(){
        System.out.println("Inintializing Trainee");
    }
    
    //@PreDestroy
    public void destroyTrainee(){
        System.out.println("Destroying Trainee");
    }
    
}
