package com.hillel.lesson_03;

public class ForExample {
    private static final String HELLO = "Hello world"; // const

    public static void main(String[] args) {
        print(HELLO);
    }

    static void print(String str) {
        char[] s = str.toCharArray();

        int[] m = new int[str.length()];

//        // index iteration
//        for (int i = 0; i < s.length; i +=2){
//            System.out.println(s[i]);
//        }
//
//        // for-each
//        for (char c : s)
//            System.out.println(c);
//
//        for (char c : s){
//            System.out.println(c);
//        }

//        int i = 0;
//        for (char c : s) {
//            System.out.print(c + " >> ");
//            if (i % 2 == 0)
//                System.out.print(c);
//                i++;
//            System.out.println();
//        }


        for (int i = 0, j = 0; i < s.length || j < m.length; i++, j++) {
            m[i] = i + j;
            System.out.print(i + j + " ");
        }

        System.out.println();

        for (int t : m) {
            System.out.print(t + " ");
        }


        // index iteration
        for (int i = 0; i < s.length; ){
            System.out.println(s[i]);
        }
    }
}
