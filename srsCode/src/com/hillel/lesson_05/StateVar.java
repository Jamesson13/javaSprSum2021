package com.hillel.lesson_05;

public class StateVar {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a1);
        System.out.println(a.a2);
    }
}
class A {
    int a1; // 0
    Integer a2 = 0; // null
}