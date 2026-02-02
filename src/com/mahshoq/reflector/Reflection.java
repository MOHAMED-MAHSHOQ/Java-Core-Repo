package com.mahshoq.reflector;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        Veicles v = new Veicles();

        Class cls = v.getClass();
        System.out.println(cls);
        Method[] methods = cls.getMethods();
        for(Method method:methods) {
            System.out.println(method.getName());
        }
            try {
                methods[0].invoke(v);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }


}
