package com.hillel.lesson_02;

public class Variables {
    public static void main(String[] args) {
        //boolean
//        boolean bool1 = true;
//        boolean bool2 = false;
//
//        System.out.println(bool1);
//        System.out.println(bool2);

        // byte - 128 .. 127
        byte b = 127;
        System.out.println(b);
        b = (byte) 256;
//        b = (byte) 129;
        System.out.println(b);

        //short
        short s = 257;
        // int
        int i = 345675646;
        //long
        long l = 100L;

        // double
        double d = 1333.33d;
        // float
        float f = 133.33f;
        float f1 = 133.33f;


        int mil = 1_000_000;


        char ch = 'c';
        char ch1 = 234;

        System.out.println(ch);
        System.out.println((int) ch);
        System.out.println(ch1);
        System.out.println((int) ch1);

    }
}
