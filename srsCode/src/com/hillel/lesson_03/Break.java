package com.hillel.lesson_03;

public class Break {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10) {
//            if (i == 5) break; //exit from loop
//            System.out.print(i++ + " ");
//        }
//        System.out.println();
//        System.out.println("------------");

        int j = 0;
        while (j < 10) {
            if (j % 2 != 0) {
                j++;
                continue;
            } else if (j == 8) {
                break;
            }
            System.out.print(j++ + " ");
        }
        /*
         code 1
         ....

         if (true)
            continue
         code 2
         ....
         */

    }
}


