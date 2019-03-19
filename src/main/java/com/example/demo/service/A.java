package com.example.demo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author wensen
 * @since 2018/10/9
 */
@Component
public class A implements ApplicationContextAware, InitializingBean {
    @Autowired
    private B b;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("a applicationcontextaware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    public void printA() {
        System.out.println("A class");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }
    private  String p1;

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public void func1() {
        System.out.println("func");

    }

}
