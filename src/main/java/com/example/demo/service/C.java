package com.example.demo.service;

import com.example.demo.service.pa.D;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author wensen
 * @since 2018/10/10
 */
@Component
public class C {

    @Autowired
    @Qualifier("dImpl1")
    private D d;

    public void init() {
        System.out.println("init-method");
    }

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }
}
