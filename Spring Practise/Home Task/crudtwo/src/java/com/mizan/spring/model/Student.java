package com.mizan.spring.model;
// Generated Dec 24, 2020 3:28:49 AM by Hibernate Tools 4.3.1

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Student generated by hbm2java
 */
@Entity
public class Student implements java.io.Serializable {

    @Id
    private Integer id;
    private String name;
    private String subject;

    public Student() {
    }

    public Student(Integer id) {
        this.id = id;
    }

    public Student(Integer id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
