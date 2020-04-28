package com.runqing.spring.di;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class Wife implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        Thief thief = new Thief();
        thief.setName("不抓我了去陪老婆逛街");
        return thief;
    }
}
