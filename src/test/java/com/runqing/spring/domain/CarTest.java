package com.runqing.spring.domain;

import com.runqing.spring.instance.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

// 测试类
@SpringBootTest
@RunWith(SpringRunner.class)
public class CarTest {

    /**
     * 通过xml的方式获取Bean中属性值
     */
    @Test
    public void testCarName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // 此处获取Bean可以使用car、cars、newCar进行获得
        Car car = (Car) context.getBean("newCar");
        String carName = car.getCarName();
        System.out.println("carName = " + carName);
        System.out.println("carChassis = " + car.getCarChassis().getChassisName());

    }

    /**
     * 用来测试使用构造器方式获取Bean（有参构造器）
     */
    @Test
    public void testCons() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Teacher teacher = (Teacher) context.getBean("teachers");
        System.out.println("老师班级为： " + teacher.getClassRoom().getClassName());
    }

}
