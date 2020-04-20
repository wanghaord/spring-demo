package com.runqing.spring.domain;

/**
 * @author runqing
 * Car实体类
 */
public class Car {
    private String carName;

    // car依赖于carChassis(汽车底盘)
    private CarChassis carChassis;

    // 必须有一个默认的无参构造器（使用构造器方式注入），否则xml配置的Car实体类将无法加载
    public Car() {
    }

    public Car(String carName, CarChassis carChassis) {
        this.carName = carName;
        this.carChassis = carChassis;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public CarChassis getCarChassis() {
        return carChassis;
    }

    public void setCarChassis(CarChassis carChassis) {
        this.carChassis = carChassis;
    }
}
