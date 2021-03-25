package com.hillel.lesson_03;

public class TypePrived {
    public static void main(String[] args) {
        byte a = 120; //127
        System.out.println(a);
        a += 2;
        System.out.println(a);
        int b = a + 8; // 122 + 10 = 132
        System.out.println(b);
        System.out.println((byte) b);
        System.out.println("-----------");
        Byte a1 = 120;
        System.out.println(a1);
        System.out.println(a1 + 10);

        byte a2 = 10;
        System.out.println(a2);
        int a3 = a2;
        System.out.println(a3);

        Double d1 = 4d;
        Double d2 = 2d;
Double res = (d1/d2);
        System.out.println(res);
        System.out.println(d1 / d2);

        System.out.println(res.compareTo(1d));
        System.out.println(res.compareTo(2d));
        System.out.println(res.compareTo(3d));

        System.out.println(Integer.valueOf("234"));
        System.out.println(Integer.valueOf("01234"));
        System.out.println(Integer.valueOf("0f1234"));

    }

}

