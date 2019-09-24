package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");
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
