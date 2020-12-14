package com.mizan.spring;

public class Employee {

    private int id;
    private String name;

    public Employee() {
        System.out.println("no-arg");
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}
