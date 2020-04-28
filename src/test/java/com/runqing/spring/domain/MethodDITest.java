package com.runqing.spring.domain;

import com.runqing.spring.di.Police;
import com.runqing.spring.scope.ThreadScope;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.config.Scope;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MethodDITest {

    /**
     * 测试方法注入
     */
    @Test
    public void di1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Police police = (Police) context.getBean("police");
        // 以下运行结果均为同一个小偷，因为默认使用的是单例模式
        System.out.println("逮到了：" + police.catchThief());
        System.out.println("逮到了：" + police.catchThief());
        System.out.println("逮到了：" + police.catchThief());
        System.out.println("逮到了：" + police.catchThief());
        System.out.println("逮到了：" + police.catchThief());
    }

    @Test
    public void replace() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Police police = (Police) context.getBean("police");
        System.out.println(police.getThief());
    }

    /**
     * 测试自定义作用域
     */
    @Test
    public void testScope() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Scope threadScope = new ThreadScope();
        context.getBeanFactory().registerScope("thread", threadScope);

        // 测试获取同一个线程中的Bean返回的都是同一个对象
        Car car = (Car) context.getBean("car");
        System.out.println("car: " + car.hashCode());
        Car car2 = (Car) context.getBean("car");
        System.out.println("car2: " + car2.hashCode());

        new Thread(new Runnable() {
            @Override
            public void run() {
                Car car3 = (Car) context.getBean("car");
                System.out.println("car3: " + car3.hashCode());
            }
        }).start();
    }

    @Test
    public void back() {
        System.out.println("back");
    }
}
