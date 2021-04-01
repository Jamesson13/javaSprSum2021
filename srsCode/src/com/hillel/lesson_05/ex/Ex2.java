package com.hillel.lesson_05.ex;

public class Ex2 {
    public static void main(String[] args)  {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        Integer i3 = 127; // Int poll
        Integer i4 = 127; // Int poll
        System.out.println(i3 == i4);
    }
}
