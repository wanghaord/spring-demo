package com.runqing.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 测试Bean的生命周期
 */
public class UserLife implements InitializingBean, DisposableBean {

    public UserLife() {
        System.out.println("user Bean 实例化");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("user bean 实例化之后");
    }

    public void hello() {
        System.out.println("hello spring");
    }
}

