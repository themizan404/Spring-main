/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.DIwithObject;

/**
 *
 * @author mohdm
 */
public class Employee {

    private int id;
    private int name;
    private Address address; // Aggregation 

    public Employee() {
        System.out.println("DI with object");
    }

    public Employee(int id, int name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show() {
        System.out.println(id + "" + name);
        System.out.println(address.toString());
    }
}
