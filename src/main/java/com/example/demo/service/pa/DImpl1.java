package com.example.demo.service.pa;

import org.springframework.stereotype.Component;

/**
 * @author wensen
 * @since 2018-11-28
 */
@Component("dImpl1")
public class DImpl1 implements D {
    @Override
    public void func() {
        System.out.println("c");
    }

}
