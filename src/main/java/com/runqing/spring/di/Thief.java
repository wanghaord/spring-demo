package com.runqing.spring.di;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.UUID;

/**
 * 小偷实体类用来测试方法注入
 */
public class Thief {

    private String name;

    public String getName() {
        return name;
    }

    public Thief() {
        this.name = UUID.randomUUID().toString();
    }



    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Thief{" +
                "name='" + name + '\'' +
                '}';
    }
}
