package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {

    public static void main(String[] args) {
        Message m = new Message();
        m.setMsg("Mizan404");
        System.out.println(m.getMsg());

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Message msg = context.getBean(Message.class);
        msg.setMsg("Hello Mizan");
        System.out.println(msg.getMsg());
    }

}
