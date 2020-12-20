package com.mizan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {
        // read spring config java class
        ApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class); // here tennisCoach is the default bean id. 
        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());
        // call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());
    }

}
