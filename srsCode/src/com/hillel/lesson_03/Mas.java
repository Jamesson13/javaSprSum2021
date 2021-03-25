package com.hillel.lesson_03;

public class Mas {
    public static void main(String[] args) {
        int[] mass = new int[5];

        int[] mas = {1,2,3,4};
        System.out.println(mas.length);

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        mass[3] = 4;
        mass[4] = 5;
        System.out.println();
        System.out.println("------");

        for (int i : mass) {
            System.out.print(i + " ");
        }

        int [] mass1 = new int[3];

        for (int i = 0; i < mass1.length; i++){
            mass1[i] = mass[i];
        }

        System.out.println();
        for (int i : mass1) {
            System.out.print(i + " ");
        }
    }
}
