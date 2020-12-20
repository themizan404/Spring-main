package com.mizan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
 
    public static void main(String[] args) {
        // read spring config java class
        ApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        // get the bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);// swimCoach is the method name whose We declare in SportConfig class. 
        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());
    }

}
