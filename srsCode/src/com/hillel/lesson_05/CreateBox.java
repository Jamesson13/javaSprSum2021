package com.hillel.lesson_05;

public class CreateBox {
    public static void main(String[] args) {
//        Box1 b1 = new Box1();
//        Box2 b2 = new Box2();
//
//        System.out.println(b1.toString());
//        System.out.println(b2.toString());

        Box b1 = new Box(1d, 1d, 1d);
        Box b2 = new Box(1d, 1d, 1d);
        Box b3 = b1;

        System.out.println(b1 == b2);
        System.out.println(b1 == b3);



        System.out.println(b1);
        System.out.println(b2);

        b2.setW(2d);

        System.out.println(b1);
        System.out.println(b2);

        b2.setD(2d);

        System.out.println(b1);
        System.out.println(b2);

    }
}
