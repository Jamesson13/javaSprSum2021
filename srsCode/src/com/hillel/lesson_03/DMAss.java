package com.hillel.lesson_03;

import java.util.Arrays;

public class DMAss {
    public static void main(String[] args) {
        int[][] dMass = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dMass[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(dMass[0].length);

        System.out.println("----------");
        System.out.println(Arrays.deepToString(dMass));

        int[][] mass = new int[4][4];

    }
}
