package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware , BeanNameAware {
    Actor actor;
    private ApplicationContext context = null;
    public Movie(){

    }
    public Movie(Actor actor) {
        this.actor = actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor(){
        return this.actor;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is: "+s+"(ApplicationContext,)");
    }
}
