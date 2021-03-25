package com.hillel.lesson_03;

public class PrivType {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        int ii = 259;
        byte bb = (byte) ii;
        System.out.println("----------------");
        System.out.println(ii);
        System.out.println(bb);




        double d = 15.02;
        i = (int) d;

        System.out.println("---------");
        System.out.println(d);
        System.out.println(i);
    }
}
