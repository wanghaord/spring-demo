package com.runqing.spring.domain;

import com.runqing.spring.lifecycle.UserLife;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BeanLifeTest {

    /**
     * 测试Bean初始化方法和销毁方法（生命周期）
     * 注意：只有单例Bean的时候才可以进行销毁，否则Spring不会帮助销毁
     */
    @Test
    public void beanLife() {
        // 使用接口的方式(spring不推荐使用因为会造成耦合)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springlife.xml");
        UserLife userLife = (UserLife) context.getBean("user");
        userLife.hello();
        context.registerShutdownHook();
    }

    @Test
    public void beanLifeXML() {
        // 使用XML方式（推荐）还可使用注解方式@PostConstruct表示容器初始化完成时操作, @PreDestroy表示容器销毁时做的操作
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springlife.xml");
        UserLife userLife = (UserLife) context.getBean("user");
        userLife.hello();
        context.destroy();
    }
}
