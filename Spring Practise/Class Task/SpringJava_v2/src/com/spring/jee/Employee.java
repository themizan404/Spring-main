/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.jee;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author Faculty Pc
 */
public class Employee {
    
    private String empName;
    private int empID;
    private Address address;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    //@PostConstruct
    public void initTrainee(){
        System.out.println("Inintializing Employee");
    }
    
    //@PreDestroy
    public void destroyTrainee(){
        System.out.println("Destroying Employee");
    }
    
    
    
}
