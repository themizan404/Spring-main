/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springluv2code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mohdm
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springluv2code/applicationContext.xml");
        CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(theCoach.getDailyFurtune());
        System.out.println(theCoach.getDailyWorkout());
    }

}
