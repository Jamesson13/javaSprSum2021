package com.hillel.lesson_05.task;

public class NumberRemover {
    public static void main(String[] args) {
        //Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива
        //(пропусков быть не должно). 1 2 3 4 5 6 4 5 4 (4) -> 1 2 3 5 6 5
        int remValue = 4;
        int[] mass = {1,2,3,4,5,4,6,3,6,4,4,4,9,0};

        int count = 0;
        for (int i : mass) if (i != remValue) count++;

        int [] newMass = new int[count];

        count = 0;
        for (int j : mass) {
            if (j != remValue) newMass[count++] = j;
        }

        for (int i : mass) System.out.print(i + " ");
        System.out.println();
        for (int i : newMass) System.out.print(i + " ");


    }
}
