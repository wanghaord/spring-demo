package com.runqing.spring.domain;

/**
 * @author runqing
 * 汽车底盘实体类，汽车Car依赖于此类
 */
public class CarChassis {
    private String chassisName;

    public CarChassis() {
    }

    public CarChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    public String getChassisName() {
        return chassisName;
    }

    public void setChassisName(String chassisName) {
        this.chassisName = chassisName;
    }
}
