package com.example.demo.service;

import com.example.demo.service.pa.D;
import org.springframework.stereotype.Component;

/**
 * @author wensen
 * @since 2018-11-28
 */
@Component
public class DImpl2 implements D {
    @Override
    public void func() {
        System.out.println("DImpl2.func");
    }
}
