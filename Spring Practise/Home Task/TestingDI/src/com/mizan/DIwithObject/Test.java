/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizan.DIwithObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mohdm
 */
public class Test {

    ApplicationContext context = new ClassPathXmlApplicationContext("com/mizan/DIwithObject/applicationContext.xml");
    Employee emp = (Employee) context.getBean("employee");

}
