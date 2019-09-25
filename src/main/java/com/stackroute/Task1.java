package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task1 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean b=context.getBean("beanlifecycle",BeanLifecycleDemoBean.class);
        b.display();
        BeanLifecycleDemoBean b1=context.getBean("beanlifecycle1",BeanLifecycleDemoBean.class);
        b1.display();
        context.registerShutdownHook();
    }
}
