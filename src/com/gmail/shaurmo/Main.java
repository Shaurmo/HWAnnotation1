package com.gmail.shaurmo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Class<?> cls = Human.class;

        Method[] methods = cls.getDeclaredMethods();
        try {
            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {
                    Test test = method.getAnnotation(Test.class);
                    System.out.println(method.invoke(null, test.parametr1(), test.parametr2()));
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
