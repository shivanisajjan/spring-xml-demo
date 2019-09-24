package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.domain.Movie1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Task1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.getActor().display();
        BeanFactory b=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie1 movie3 = context.getBean("movie2", Movie1.class);
        movie3.getActor().display();
    }
}
