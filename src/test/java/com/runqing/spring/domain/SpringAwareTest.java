package com.runqing.spring.domain;

import com.runqing.spring.aware.TUserService;
import com.runqing.spring.event.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringAwareTest {

    @Test
    public void testPubliserAware() throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springaware.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.register("12345@qq.com");
    }

    @Test
    public void testPubliserAware2() throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springaware.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.register("12345@qq.com");
    }

    @Test
    public void testBeanClassLoader() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springaware.xml");
        TUserService userService = (TUserService) context.getBean("tuserService");

    }
}
