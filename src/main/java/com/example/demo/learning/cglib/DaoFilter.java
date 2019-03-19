package com.example.demo.learning.cglib;

import org.springframework.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * @author wensen
 * @since 2018/10/11
 */
public class DaoFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {
        if ("select".equalsIgnoreCase(method.getName())) {
            return 0;
        }

        return 0;
    }
}
