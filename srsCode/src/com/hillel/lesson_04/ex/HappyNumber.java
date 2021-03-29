package com.hillel.lesson_04.ex;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.next();

        if (value.length() % 2 != 0){
            System.out.println(false);
        } else {
            String[] strArray = value.split("");

            int summL= 0;
            int summR = 0;
            for (int i = 0; i < strArray.length / 2; i++){
                summL += Integer.valueOf(strArray[i]);
                summR += Integer.parseInt(strArray[strArray.length - i - 1]);
            }
            System.out.println(summL == summR);

        }



    }
}
