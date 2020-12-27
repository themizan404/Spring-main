/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mohdm
 */
@Entity(name = "doctor")
public class Doctor {

    @Id
    private int id;
    private String name;
    private String degree;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

}
