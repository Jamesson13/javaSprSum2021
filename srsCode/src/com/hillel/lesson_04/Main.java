package com.hillel.lesson_04;

public class Main {
    public static void main(String[] args) {
        Clazz clazz1 = new Clazz();
        Clazz clazz2 = new Clazz();

        System.out.println(clazz1.calc()); // 15 + 0
        System.out.println(clazz2.calc()); // 15 + 0

        clazz1.value = 10;
        clazz2.value = 20;

        System.out.println(clazz1.calc()); // 15 + 10
        System.out.println(clazz2.calc()); // 15 + 20

        Clazz.setIndex(20);

        System.out.println(clazz1.calc()); // 20 + 10
        System.out.println(clazz2.calc()); // 20 + 20


        System.out.println("-----------");

        MethodExample.printS(); // static method -> Class

        new MethodExample().print(); // method -> Object


    }
}
