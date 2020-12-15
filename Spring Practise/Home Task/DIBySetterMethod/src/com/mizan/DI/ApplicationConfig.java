/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mohdm
 */
public class ApplicationConfig {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mizan/DI/context.xml");
        Trainee trainee = (Trainee) context.getBean("trainee");
        trainee.display();

    }

}
