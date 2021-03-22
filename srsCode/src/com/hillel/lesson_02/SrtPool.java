package com.hillel.lesson_02;

public class SrtPool {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "cat";

        String str3 = new String("Cat");
        str3 = str3.toLowerCase().intern();

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));


    }
}
