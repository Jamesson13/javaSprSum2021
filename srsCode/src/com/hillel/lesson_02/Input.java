package com.hillel.lesson_02;

public class Input {
    public static void main(String[] args) {
        int summ = 0;
        System.out.println("input array size : " +
                args.length);
        for (String str : args) {
            System.out.println(str);
            int i = Integer.valueOf(str);
//            summ = summ + i;
            summ +=i;
        }
        System.out.println(summ);
    }
}
