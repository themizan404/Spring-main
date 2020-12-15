/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.java;

import com.spring.java.coupling.Car;
import com.spring.jee.Employee;
import com.spring.jee.Trainee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Faculty Pc
 */
public class MainApp {
    
    
    public static void main(String[] args) {

        //AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/java/applicationContext.xml");
        //context.registerShutdownHook();
        
        //Message m = (Message) context.getBean("message1");
        //m.setMsg("My Message set");
        //System.out.println(m.getTraineeMessage());
        //System.out.println(m.getTraineeMessage1());
        
        //Message m1 = (Message) context.getBean("message");
        //m1.setMsg("My Message1 set");
       // System.out.println(m1.getMsg());
        //m.showMessage();
        
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/java/applicationContext.xml");
        //context.registerShutdownHook();
        //        Employee employee = (Employee) context.getBean("employee");
//        employee.setEmpName("Employee Name A");
//        System.out.println(employee.getEmpName());
        
        Trainee trainee = (Trainee) context.getBean("t");
        trainee.setName("Trainee Name A");
        System.out.println(trainee.getName());
        System.out.println(trainee.getAddress());
        

        
        
        
    }
}
