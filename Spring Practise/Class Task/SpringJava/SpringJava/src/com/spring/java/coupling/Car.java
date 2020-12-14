/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.java.coupling;

/**
 *
 * @author Faculty Pc
 */
public class Car {
    
    ITesla tesla;

    public Car(ITesla tesla) {
        this.tesla = tesla;
    }

    public Car() {
    }
    
    public void callTesla() {
        tesla.model();
    }
}
