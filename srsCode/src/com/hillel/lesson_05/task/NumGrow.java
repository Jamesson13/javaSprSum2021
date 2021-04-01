package com.hillel.lesson_05.task;

// Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
public class NumGrow {
    public static void main(String[] args) {
        int[] mass = {1, 25, 122345, 125, 456}; // -> 12345

        for (int i : mass){
            if (String.valueOf(i).length() == 1) continue;
            String[] str = String.valueOf(i).split("");
            int count = 1;
            for (int j = 1; j < str.length; j++){
                if (Integer.parseInt(str[j - 1]) != Integer.parseInt(str[j]) - 1) {
                    break;
                }
                count++;
            }
            if (count == str.length){
                System.out.println(i);
                break;
            }


        }



    }
}
