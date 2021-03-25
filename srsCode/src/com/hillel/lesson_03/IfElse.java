package com.hillel.lesson_03;

public class IfElse {
    public static void main(String[] args) {

        int a = 20;
        int b = 15;

        if (a == b) {
            System.out.println("a = b");
            System.out.println("b = a");
        }

        if (a < b){
           // return;
        }

        if (a > b){
        }

        if (true) {
            // statement
        } else {
            // statement
        }

        if (a < b) {
            System.out.println("a < b");
        } else if (a == b) {
            System.out.println("a = b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println(true);
        }

        // ternary operation
        System.out.println(compare(a, b) ? 1 : 0);
        System.out.println(compare(b, a) ? 1 : 0);

        System.out.println(a < b ? 1 : 0);
        System.out.println(a > b ? 1 : 0);

        System.out.println(a > b ? print1() : print2());

        System.out.println(a < b && a > b ? a > b ? 1 : 0 : print2());

    }

    static boolean compare(int a, int b) {
        return a < b;
    }

    static String print1(){
        System.out.println("print1");
        return "1";
    }
    static String print2(){
        System.out.println("print2");
        return "2";
    }
}
