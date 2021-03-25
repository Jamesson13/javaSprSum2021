package com.hillel.lesson_03.ex;

import java.util.Scanner;

public class ChetSumm {
    public static void main(String[] args) {
        // Найти сумму четных цифр числа
        // input:  123456
        // output: 2 + 4 + 6 = 12
        Scanner sc = new Scanner(System.in);
        String var = sc.next();
        System.out.println("Number : " + var);

        String[] splitVar = var.split("");
        int summC = 0;
        int countC = 0;
        int summN = 0;
        int countN = 0;

        for (String s : splitVar) {
            Integer i = Integer.parseInt(s);
            if (i % 2 == 0) {
                summC += i;
                countC++;
            } else {
                summN += i;
                countN++;
            }
        }
        System.out.println(countC + " " +summC);
        System.out.println(countN + " " +summN);

    }
}
