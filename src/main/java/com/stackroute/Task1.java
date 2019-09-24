package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Task1 {
    public static void main(String[] args){
        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie=beanFactory.getBean("movie", Movie.class);
        System.out.println("Using BeanFactory");
        movie.actordisplay();
        System.out.println("-----------------------------------");

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie", Movie.class);
        System.out.println("Using ApplicationContext");
        movie1.actordisplay();
    }
}
