package com.runqing.spring.scope;

import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义bean作用域
 */
public class ThreadScope implements Scope {

    ThreadLocal<Object> local = new ThreadLocal<Object>() {
        @Override
        protected Object initialValue() {
            return new HashMap<String, Object>();
        }
    };


    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        HashMap map = (HashMap) local.get();
        Object object = null;
        if ((object = map.get(name)) == null) {
            object = objectFactory.getObject();
            map.put(name, object);
            local.set(map);
        }
        return object;
    }

    @Override
    public Object remove(String name) {
        Map map = (Map) local.get();
        if (map.get(name) != null) {
            local.remove();
            return map.get(name);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
