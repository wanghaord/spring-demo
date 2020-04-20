package com.runqing.spring.instance;

public class ClassRoom {

    private String className;

    private static ClassRoom classRoom = new ClassRoom("高三24");

    public ClassRoom() {
    }

    public ClassRoom(String className) {
        this.className = className;
    }

    /**
     * 使用静态工厂方式
     * @return
     */
    public static ClassRoom getInstance() {
        return classRoom;
    }

    /**
     * 采用实例工厂
     * @return
     */
    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
