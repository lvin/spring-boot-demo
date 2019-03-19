package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wensen
 * @since 2018/10/9
 */
@Component
public class B {

    @Autowired
    private A a;
}
