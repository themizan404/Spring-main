/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author A9
 */
public class SpringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springtest/Context.xml");
        Message m = (Message) context.getBean("msg");
        m.setMsg("Mizan");
        System.out.println(m.getMsg());
    }

}
