package com.hillel.lesson_03;

public class WhileCounterExample {
    public static void main(String[] args) {

        String pass = "wrong_passwors";

        boolean result = false;
        int counter = 0;
        do {
            if (pass.equals("1111")) {
                result = true;
            }
            counter++;
            System.out.println(pass + " : " + result);

        } while (!result && counter < 5);

        counter = 0;
        do {
            System.out.println(counter++);
        } while (counter < 10);
        System.out.println("FINISH");
    }
}
