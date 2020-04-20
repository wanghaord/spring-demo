package com.runqing.spring.instance;

/**
 * @author runqing
 * 教师实体类
 * 老师办公依赖于教室，如果使用有参构造器的方式将教室注入，此时Teacher不需要再提供一个默认的构造函数
 * 注意：不可将setter方法删除否则无法注入
 */
public class Teacher {
    private ClassRoom classRoom;

    public Teacher(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
