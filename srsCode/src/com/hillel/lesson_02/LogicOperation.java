package com.hillel.lesson_02;

public class LogicOperation {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;
//
//        System.out.println(a < b);
//        System.out.println(a < c);
//        System.out.println(a <= b);
//        System.out.println(a <= c);
//        System.out.println();
//        System.out.println(a > b);
//        System.out.println(a > c);
//        System.out.println(a >= b);
//        System.out.println(a >= c);
//        System.out.println();
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a != b);
//        System.out.println(a != c);
//        System.out.println();

//        System.out.println(oFalse() && oTrue() && oFalse() && oTrue());
//        System.out.println("-----------");
//        System.out.println(oFalse() & oTrue() & oFalse() & oTrue());
//        System.out.println("==========");
//        System.out.println( oTrue() || oFalse() || !oTrue() & a == b + 1 && true);
//        System.out.println("-----------");
//        System.out.println( oTrue() | oFalse() | !oTrue());
//
//
//        System.out.println(!oTrue());
//        System.out.println(!oFalse());

        System.out.println(b == a + c);


    }

    private static boolean oTrue()
    {
        System.out.println("> true ") ;
        return true;
    }

    private static boolean oFalse()
    {
        System.out.println("> false") ;
        return false;
    }


}
