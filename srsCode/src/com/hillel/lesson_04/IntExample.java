package com.hillel.lesson_04;

import com.hillel.lesson_02.INcr;

public class IntExample {
    public static void main(String[] args) {

        Integer i1 = 127; // int pool
        Integer i2 = 127; // int pool ---> 127
        Integer i3 = i1;  // int poll

        System.out.println(i1 == i2);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        i1 = 5;

        System.out.println(i1);
        System.out.println(i1 == i2);
        System.out.println(i2);
        System.out.println(i3);


        i1 = Integer.valueOf(2000);
        i2 = Integer.valueOf(2000);
        i3 = i1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        i1 = 300;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
