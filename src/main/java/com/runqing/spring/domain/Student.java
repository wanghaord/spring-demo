package com.runqing.spring.domain;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author runqing
 * 用来测试Set、List、Map注入
 */
public class Student {
    private List<String> hobby;
    private Set<String> eat;
    private Map info;
    private Properties properties;

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Set<String> getEat() {
        return eat;
    }

    public void setEat(Set<String> eat) {
        this.eat = eat;
    }

    public Map getInfo() {
        return info;
    }

    public void setInfo(Map info) {
        this.info = info;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
