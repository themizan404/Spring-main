package com.sany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaApplication1 {

    public static void main(String[] args) {
        /*   Model m = new Model();
        m.setMsg("Hello World");
        System.out.println(m.getMsg());

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Model msg = context.getBean(Model.class);
        msg.setMsg("Hello Spring");
        System.out.println(msg.getMsg()); */

        ApplicationContext context = new ClassPathXmlApplicationContext("com/sany/newXMLDocument.xml");

        Model msg = (Model) context.getBean("msg");
        msg.Show();

//     msg.setMsg("Hello");
//        System.out.println(msg.getMsg());
    }

}
