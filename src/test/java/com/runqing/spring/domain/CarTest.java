package com.runqing.spring.domain;

import com.runqing.spring.instance.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CarTest {

    /**
     * 通过xml的方式获取Bean的属性值
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

    /**
     * 用来测试集合注入
     */
    @Test
    public void testList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getHobby());
    }

    /**
     * 用来测试Set集合注入
     */
    @Test
    public void testSet() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getEat());
    }

    /**
     * 用来测试Map集合注入
     */
    @Test
    public void testMap() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getInfo());
    }

}
