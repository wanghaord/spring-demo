package com.runqing.spring.di;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 警察实体类用来测试方法注入
 */
public class Police implements ApplicationContextAware {

    /**
     * 想要每次抓小偷的时候产生不一样的bean（每次都是新的小偷）  **使用LookUP方法**
     * 1、实现ApplicationContextAware接口
     * 2、维护一个ApplicationContext变量
     * 3、重写setApplicationContext方法将维护的变量设置值
     * 4、在抓小偷的时候使用context中的getBean()这样每次就相当于获取了一个新new的小偷类
     * 5、在spring.xml中还需要配置scope="prototype"，请注意是在thief的bean上配置
     */
    private ApplicationContext context;

    private Thief thief;

   /* public Thief getThief() {
        return context.getBean("thief", Thief.class);
    }*/

   //用来测试方法替换
    public Thief getThief() {
        Thief thief = new Thief();
        thief.setName("来抓我啊");
        return thief;
    }

    public void setThief(Thief thief) {
        this.thief = thief;
    }

    public Thief catchThief() {
        return thief;
    }

    @Override
    public String toString() {
        return "Police{" +
                "thief=" + thief +
                '}';
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = context;
    }
}
