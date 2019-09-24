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
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("");
        System.out.println("Use default scope(Singleton)");
        Movie movie1=context.getBean("movie1", Movie.class);
        movie1.actordisplay();
        Movie movie2=context.getBean("movie1", Movie.class);
        movie2.actordisplay();
        if(movie1==movie2)
            System.out.println("Using Singleton:Equal");
        else
            System.out.println("Using Singleton:Not Equal");

        System.out.println("");
        System.out.println("Use scope as Prototype");
        Movie movie3=context.getBean("movie2", Movie.class);
        movie3.actordisplay();
        Movie movie4=context.getBean("movie2", Movie.class);
        movie4.actordisplay();
        if(movie3==movie4)
            System.out.println("Using ProtoType:Equal");
        else
            System.out.println("Using ProtoType:Not Equal");

        System.out.println("");
        System.out.println("Replace id of the Movie bean with name having two values");
        Movie movie5=context.getBean("movie3", Movie.class);
        movie5.actordisplay();
        Movie movie6=context.getBean("movie4", Movie.class);
        movie6.actordisplay();
    }
}
