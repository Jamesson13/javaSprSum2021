package com.hillel.lesson_03.ex;

import java.util.Arrays;
import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var = sc.next();
        System.out.println("Number : " + var);

        String[] splitVar = var.split("");
        String[] reverse = new String[splitVar.length];

        for (int i =0; i < splitVar.length; i++){
            reverse[reverse.length - i - 1] = splitVar[i];
        }

        System.out.println(Arrays.deepToString(reverse));

        String result = "";

        for (String srt : reverse)
            result = result.concat(srt);

        System.out.println(result);

        String result2 = "";

        for (int i = splitVar.length - 1; i >= 0 ; i--){
            result2 = result2.concat(splitVar[i]);
        }

        System.out.println(result2);
    }
}
