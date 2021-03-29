package com.hillel.lesson_04;

public class Stack {
    public static void main(String[] args) {
        int k = 0; // 1 (k) - 1

        for (int i = 0; i < 5; i++){  // 2 (i) - 2
            fr(i);
            k = i;
            for (int j = 0; j < 5; j++){ // 3 (j) - 3
                sec(j);
                k =j;
            } // 3 drop - 2
        }  // 2 drop - 1

        // stack 1 (k)
        if (false) {
            int d = 0; // 2 (d)
        } else {
            int d = 0; // 2 (d)
        } // d drop - 1


        int s = 9; // 2 (s)

        // s drop
        // k drop
    } // 0 - FINISH

    private static void fr(int i){
        System.out.println(i); // new var

    }

    private static void sec(int j){
        System.out.println(j); // new var
    }
}
