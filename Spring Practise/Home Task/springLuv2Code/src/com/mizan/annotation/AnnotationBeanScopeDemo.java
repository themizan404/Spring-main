/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mohdm
 */
public class AnnotationBeanScopeDemo {

    public static void main(String[] args) {
// load spring config file 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/mizan/annotation/applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoachs = context.getBean("tennisCoach", Coach.class);
// check if they are the same
        boolean result = (theCoach == alphaCoachs);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for alphCoach: " + alphaCoachs + "\n");;
    }
}
