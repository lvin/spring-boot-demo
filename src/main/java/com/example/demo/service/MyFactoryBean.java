package com.example.demo.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author wensen
 * @since 2018/10/10
 */
@Component
public class MyFactoryBean implements FactoryBean<FactoryBeanObject> {
    @Override
    public FactoryBeanObject getObject() throws Exception {
        return new FactoryBeanObject();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
