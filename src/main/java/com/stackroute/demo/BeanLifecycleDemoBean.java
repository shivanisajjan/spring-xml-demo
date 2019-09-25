package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String p;

    public void setP(String p) {
        this.p = p;
        System.out.println("Properties set successfully");
    }
    public void display(){
        System.out.println(this.p+" Welcome to CGI");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After property set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable Bean");
    }
    public void customInit(){
        System.out.println("Custom Initializing");
    }
    public void customDestroy(){
        System.out.println("Custom Destroy");
    }
}
