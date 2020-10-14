package com.gmail.shaurmo;

public class Human {
    @Test(parametr1 = "Alex", parametr2 = 18)
    public static String info(String name, int age){
        return name+":"+age;
    }
}
