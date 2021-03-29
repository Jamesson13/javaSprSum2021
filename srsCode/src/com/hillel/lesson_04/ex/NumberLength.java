package com.hillel.lesson_04.ex;

public class NumberLength {
    public static void main(String[] args) {
        for (String s : args){
            System.out.print(s + " ");
        }

        if (args.length != 0){
            String min = args[0];
            String max = args[0];

            for (String s : args){
                if (min.length() > s.length()) min = s;
                if (max.length() < s.length()) max = s;
            }
            System.out.println();
            System.out.println("min : " + min + " >>> length : " + min.length());
            System.out.println("max : " + max + " >>> length : " + max.length());
        }
    }
}
